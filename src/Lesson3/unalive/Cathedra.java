package Lesson3.unalive;

import Lesson3.people.Teacher;

import java.util.ArrayList;

public class Cathedra {

    private ArrayList <Teacher> listOfTeachers;
    private ArrayList <Auditory> listOfRooms;

    public Cathedra(ArrayList <Teacher> teachers, ArrayList <Auditory> auditories){
        this.listOfTeachers = teachers;
        this.listOfRooms = auditories;
    }

}
