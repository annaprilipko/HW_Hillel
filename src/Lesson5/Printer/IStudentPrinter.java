package Lesson5.Printer;

import Lesson5.Converter.IStudentStringConverter;
import Lesson5.Student.Student;

public interface IStudentPrinter {

    void printStudent(Student student, IStudentStringConverter converter);

}
