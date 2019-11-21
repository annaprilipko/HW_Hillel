package Lesson5.Printer;

import Lesson5.Converter.IStudentStringConverter;
import Lesson5.Student.Student;

public class OutPrinter implements IStudentPrinter{
    @Override
    public void printStudent(Student student, IStudentStringConverter converter) {
        System.out.println(converter.convert(student));
    }
}
