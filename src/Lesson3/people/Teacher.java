package Lesson3.people;

public class Teacher {
    private String name;

    public Teacher(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String toString() {
        return String.format("%s", getName());
    }
}
