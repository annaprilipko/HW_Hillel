package Lesson5.Printer;

import Lesson5.Converter.IStudentStringConverter;
import Lesson5.Student.Student;

public class NullPrinter implements IStudentPrinter{
    @Override
    public void printStudent(Student student, IStudentStringConverter converter) {
        converter.convert(student);
    }
}
