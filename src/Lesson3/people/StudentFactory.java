package Lesson3.people;

import java.util.Random;

public class StudentFactory {

    public static Student creat(){

        String[] names = {"Вася","Маша","Катя","Саша","Петя","Ангелина","Федор"};

        Random random = new Random();

        String studentName = names[random.nextInt(names.length)];
        int studentAge = random.nextInt(100);
        double studentMark = random.nextInt(10);

        Student student = new Student(studentName, studentAge, studentMark);

        return student;
    }

}
