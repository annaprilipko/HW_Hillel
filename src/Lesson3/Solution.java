package Lesson3;

import Lesson3.Schedule.ScheduleRow;
import Lesson3.people.Student;
import Lesson3.people.StudentFactory;
import Lesson3.people.Teacher;
import Lesson3.unalive.Auditory;
import Lesson3.unalive.Cathedra;
import Lesson3.unalive.Faculty;
import Lesson3.unalive.Group;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Solution {
    public static void main(String[] args){

        List<Group> allGroupsList = new ArrayList<>();
        List<Teacher> allTeachersList = new ArrayList<>();
        List<Auditory> allAuditorysList = new ArrayList<>();

        /**
         * Making groups with students
         */

        ArrayList <Student> studentsInGroup1 = new ArrayList<>();
        Group group1 = new Group("Z-55");
        allGroupsList.add(group1);
        group1.setListOfStudents(30, studentsInGroup1);

        ArrayList <Student> studentsInGroup2 = new ArrayList<>();
        Group group2= new Group("A-2655");
        allGroupsList.add(group2);
        group2.setListOfStudents(30, studentsInGroup2);

        ArrayList <Student> studentsInGroup3 = new ArrayList<>();
        Group group3 = new Group("J-12");
        allGroupsList.add(group3);
        group3.setListOfStudents(30, studentsInGroup3);

        /**
         * Making math cathedra with teacher a nd auditorys which are connected to this cathedra
         */

        ArrayList<Teacher> mathTeathers = new ArrayList<>();

        Teacher petrov = new Teacher("Petrov");
        Teacher sidorov = new Teacher("Sidorov");
        mathTeathers.add(petrov);
        mathTeathers.add(sidorov);

        allTeachersList.add(petrov);
        allTeachersList.add(sidorov);

        ArrayList<Auditory> mathCathedraAuditorys = new ArrayList<>();

        Auditory mathAudituryOne = new Auditory(403);
        Auditory mathAudituryTwo = new Auditory(405);
        mathCathedraAuditorys.add(mathAudituryOne);
        mathCathedraAuditorys.add(mathAudituryTwo);

        allAuditorysList.add(mathAudituryOne);
        allAuditorysList.add(mathAudituryTwo);

        Cathedra mathCathedra = new Cathedra(mathTeathers, mathCathedraAuditorys);

        /**
         * Making prog cathedra with teacher a nd auditorys which are connected to this cathedra
         */

        ArrayList<Teacher> progTeathers = new ArrayList<>();

        Teacher novikov = new Teacher("Novikov");
        Teacher plushkin = new Teacher("Plushkin");
        mathTeathers.add(novikov);
        mathTeathers.add(plushkin);

        allTeachersList.add(novikov);
        allTeachersList.add(plushkin);

        ArrayList<Auditory> progCathedraAuditorys = new ArrayList<>();

        Auditory progAudituryOne = new Auditory(509);
        Auditory progAudituryTwo = new Auditory(535);

        allAuditorysList.add(progAudituryOne);
        allAuditorysList.add(progAudituryTwo);

        Cathedra progCathedra = new Cathedra(progTeathers, progCathedraAuditorys);

        ArrayList<Cathedra> listCathedrasForCoderFaculty = new ArrayList<>();
        listCathedrasForCoderFaculty.add(mathCathedra);
        listCathedrasForCoderFaculty.add(progCathedra);

        /**
         * Making coderFaculty
         */

        Faculty coderFaculty = new Faculty(listCathedrasForCoderFaculty);

        /**
         * Making Schedule
         */

        for (int i = 0; i < 7; i++) {
            makeScheduleRow(allAuditorysList, allGroupsList, allTeachersList);
        }

    }

    public static ScheduleRow makeScheduleRow(List<Auditory> auditories, List<Group> groups, List<Teacher> teachers){

        String [] dayOfWeek = new String[]{"MON", "TEU", "WED", "THU", "FRI", "SAT", "SUN"};
        String [] lesson = new String[]{"8.30","10.25","12.35","14.30","16.25","18.10"};

        Random random = new Random();

        Auditory someAuditory = auditories.get(random.nextInt(auditories.size()));
        Group someGroup = groups.get(random.nextInt(groups.size()));
        Teacher someTeacher = teachers.get(random.nextInt(teachers.size()));
        String someDayOfWeek = dayOfWeek[random.nextInt(dayOfWeek.length)];
        String someLesson = lesson[random.nextInt(lesson.length)];

        System.out.printf("%5s |  %10s |  %10s |  %3s |  %5s |\n",
                someAuditory,
                someGroup,
                someTeacher,
                someDayOfWeek,
                someLesson);

        return new ScheduleRow(someAuditory, someGroup, someTeacher, someDayOfWeek, someLesson);
    }
}
