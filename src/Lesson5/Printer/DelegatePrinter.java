package Lesson5.Printer;

import Lesson5.Converter.IStudentStringConverter;
import Lesson5.Student.Student;

import java.util.Random;

public class DelegatePrinter implements IStudentPrinter {

    IStudentPrinter[] printers = new IStudentPrinter[]{new NullPrinter(), new OutPrinter()};
    Random random = new Random();

    @Override
    public void printStudent(Student student, IStudentStringConverter converter) {
            printers[random.nextInt(printers.length)].printStudent(student, converter);
    }
}
