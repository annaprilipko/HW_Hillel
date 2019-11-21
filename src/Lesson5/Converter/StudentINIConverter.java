package Lesson5.Converter;

import Lesson5.Student.Student;

public class StudentINIConverter implements IStudentStringConverter{

    @Override
    public String convert(Student student){

        StringBuilder builder = new StringBuilder();

        builder.append("name=").append(student.getName()).append("\n").append("age=").append(student.getAge());

        return builder.toString();
    }
}
