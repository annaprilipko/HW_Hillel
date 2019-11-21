package Lesson5;

import Lesson5.Converter.IStudentStringConverter;
import Lesson5.Converter.StudentINIConverter;
import Lesson5.Converter.StudentJSONConverter;
import Lesson5.Converter.StudentXMLConverter;
import Lesson5.Printer.DelegatePrinter;
import Lesson5.Printer.NullPrinter;
import Lesson5.Printer.OutPrinter;
import Lesson5.Student.Student;

public class Solution {
    public static void main(String[] args){

        Student student1 = new Student("Jon", 89);

        StudentINIConverter INIConverter = new StudentINIConverter();
        StudentJSONConverter JSONConverter = new StudentJSONConverter();
        StudentXMLConverter XMLConverter = new StudentXMLConverter();

        OutPrinter outPrinter = new OutPrinter();
        DelegatePrinter delegatePrinter = new DelegatePrinter();
        NullPrinter nullPrinter = new NullPrinter();

        System.out.println("Out printer is working");

        outPrinter.printStudent(student1, INIConverter);
        outPrinter.printStudent(student1, JSONConverter);
        outPrinter.printStudent(student1, XMLConverter);

        System.out.println("Delegate printer is working");

        delegatePrinter.printStudent(student1, INIConverter);
        delegatePrinter.printStudent(student1, JSONConverter);
        delegatePrinter.printStudent(student1, XMLConverter);

        System.out.println("Null printer is working");

        nullPrinter.printStudent(student1, INIConverter);
        nullPrinter.printStudent(student1, JSONConverter);
        nullPrinter.printStudent(student1, XMLConverter);

        System.out.println("Null printer stops");


    }
}
