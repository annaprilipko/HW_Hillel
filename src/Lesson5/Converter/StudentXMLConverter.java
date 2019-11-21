package Lesson5.Converter;

import Lesson5.Student.Student;

public class StudentXMLConverter implements IStudentStringConverter {
    @Override
    public String convert(Student student){

        StringBuilder builder = new StringBuilder();

        builder.append("<student>\n")
                .append("<name>").append(student.getName()).append("</name>\n")
                .append("<age>").append(student.getAge()).append("</age>\n")
                .append("</student>");

        return builder.toString();
    }
}
