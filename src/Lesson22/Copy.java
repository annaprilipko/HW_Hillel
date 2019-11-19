package Lesson22;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy implements Runnable{

    @Override
    public void run() {
        try(FileInputStream inputStream = new FileInputStream("C:\\Users\\Anna\\Desktop\\конспект.txt");
            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Anna\\Desktop\\конспектКопия.txt")){
            System.out.println("File stats copy");
            while (inputStream.available() > 0){
                int readByte = inputStream.read();
                if (readByte < 0){
                    break;
                }
                outputStream.write(readByte);
            }
            System.out.println("Work is done");
        } catch (IOException e){
            System.out.println("IOException " + e.getMessage());
        }
    }
}
