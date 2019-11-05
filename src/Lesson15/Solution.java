package Lesson15;

import javax.swing.*;
import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args){

        //1

        try(DataOutputStream stream = new DataOutputStream(new FileOutputStream("data.bin"))){
            stream.writeByte(123);
            stream.writeBoolean(false);
            stream.writeLong(1548461315);
        }catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        //2

        try(DataInputStream stream = new DataInputStream(new FileInputStream("data.bin"))){
            long number = stream.readLong();
            boolean bool = stream.readBoolean();
            byte b = stream.readByte();
        }catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        //3

        List<String> stringList = new ArrayList<>();
        stringList.add("String1");
        stringList.add("String2");
        stringList.add("String3");

        List<String> emptyList = new ArrayList<>();

        try (DataOutputStream streamOut = new DataOutputStream(new FileOutputStream("data2.bin"));
             DataInputStream streamIn = new DataInputStream(new FileInputStream("data2.bin"))){

            for (String str: stringList) {
                streamOut.writeUTF(str);
            }

            while (streamIn.available() > 0){
                emptyList.add((String) streamIn.readUTF());
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        for (String str: emptyList) {
            System.out.println(str);
        }

        // 5

        List<Contact> contactsList = new ArrayList<>();
        contactsList.add(new Contact("Name1"));
        contactsList.add(new Contact("Name2"));
        contactsList.add(new Contact("Name3"));

        List<Contact> emptyContactList = new ArrayList<>();

        try (FileInputStream fileInputStream = new FileInputStream("data3.bin");
                ObjectOutputStream streamOut = new ObjectOutputStream(new FileOutputStream("data3.bin"));
             ObjectInputStream streamIn = new ObjectInputStream(fileInputStream)){

            for (Contact contact: contactsList) {
                streamOut.writeObject(contact);
            }

            while (fileInputStream.available() > 0){
                emptyContactList.add((Contact)streamIn.readObject());
            }


        }catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        for (Contact contact: emptyContactList) {
            System.out.println(contact.getName());
        }

        //4

        List<Contact> contactsOneMoreList = new ArrayList<>();
        contactsOneMoreList.add(new Contact("Name1"));
        contactsOneMoreList.add(new Contact("Name2"));
        contactsOneMoreList.add(new Contact("Name3"));

        List<Contact> emptyOneMoreContactList = new ArrayList<>();

        try (DataOutputStream streamOut = new DataOutputStream(new FileOutputStream("data4.bin"));
             DataInputStream streamIn = new DataInputStream(new FileInputStream("data4.bin"))){

            for (Contact contact: contactsOneMoreList) {
                streamOut.writeUTF(contact.getName());
            }

            while (streamIn.available() > 0){
                emptyOneMoreContactList.add(new Contact(streamIn.readUTF()));
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        for (Contact contact: emptyOneMoreContactList) {
            System.out.println(contact.getName());
        }

        //Посчитать количество файлов в директории и во всех вложенных папках.

        CountFiles.showHowManyFiles(".");
        System.out.println(CountFiles.fileLength);

    }

}
