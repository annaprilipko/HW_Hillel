package Lesson3.Schedule;

import Lesson3.people.Teacher;
import Lesson3.unalive.Auditory;
import Lesson3.unalive.Group;

public class ScheduleRow {
    private Auditory room;
    private Group group;
    private Teacher teacher;
    private String dayOfWeek;
    private String lesson;

    public ScheduleRow(Auditory room, Group group, Teacher teacher, String dayOfWeek, String lesson){
        this.room = room;
        this.group = group;
        this.teacher = teacher;
        this.dayOfWeek = dayOfWeek;
        this.lesson = lesson;
    }
}
