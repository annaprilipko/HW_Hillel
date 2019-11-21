package Lesson5.Converter;

import Lesson5.Student.Student;

public class StudentJSONConverter implements IStudentStringConverter {
    @Override
    public String convert(Student student){

        StringBuilder builder = new StringBuilder();

        builder.append("{\n").append("\"name\"")
                .append("; ").append(student.getName())
                .append(", ").append("\"age\"")
                .append("; ").append(student.getAge())
                .append("\n}");

        return builder.toString();
    }
}
