package Lesson7.practis2;

import java.util.Comparator;

public class Student{

    private String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Name is %s, age is %d", this.name, this.age);
    }

    /*static class compareByName implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
    static class compareByAge implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getAge().compareTo(o2.getAge());
        }
    }
    static class compareByNameAndAge implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            if(o1.getName().compareTo(o2.getName()) == 0){
                if(o1.getAge().compareTo(o2.getAge()) == 0) return 0;
            }
            return o1.getName().compareTo(o2.getName());
        }
    }*/

}
