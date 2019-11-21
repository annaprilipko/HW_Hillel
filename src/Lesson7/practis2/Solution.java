package Lesson7.practis2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Den", 22));
        studentList.add(new Student("Ann", 18));
        studentList.add(new Student("Pen", 30));
        studentList.add(new Student("Ket", 35));
        studentList.add(new Student("Ann", 56));


        System.out.println("Sorting by age:");

        Collections.sort(studentList, ((o1, o2) -> {
            return Integer.compare(o1.getAge(),o2.getAge());
        }));

        for (Student s: studentList){
            System.out.println(s);
        }

        System.out.println("Sorting by name:");

        Collections.sort(studentList, (o1,o2) -> {
            return o1.getName().compareTo(o2.getName());
        });

        for (Student s: studentList){
            System.out.println(s);
        }

        System.out.println("Sorting by age if names are equals:");

        Collections.sort(studentList, (o1, o2)->{
            if( !o1.getName().equals(o2.getName()) ) return o1.getName().compareTo(o2.getName());
            else return Integer.compare(o1.getAge(), o2.getAge());
        });

        for (Student s: studentList){
            System.out.println(s);
        }


    }
}
