package Lesson3.people;

public class Student {
    private String name;
    private int age;
    private double mark;

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMark() {
        return mark;
    }


    public String toString(){
        return "Имя студента " + this.name + " возраст " + this.age + " оценка " + this.mark;
    }
}
