package com.company;

import java.time.LocalDate;
import java.time.LocalTime;

public class Lesson {
    LocalDate dateLesson;
    Group group;
    Student[] studentsPresent;
    Course course;
    LocalTime timeLesson;
    boolean wasHoeWork;
    boolean wasExam;



    public Lesson(){}

    public Lesson (LocalDate dateLesson, Group group, Student[] studentsPresent, Course course, LocalTime timeLesson, boolean wasHoeWork, boolean wasExam){
        this.dateLesson = dateLesson;
        this.group = group;
        for (int i = 0; i < studentsPresent.length; i++){
            if (studentsPresent[i] != null){
                this.studentsPresent[i] = studentsPresent[i];
            }
        }
        this.course = course;
        this.timeLesson = timeLesson;
        this.wasHoeWork = wasHoeWork;
        this.wasExam = wasExam;
    }

    @Override
    public String toString(){
        String message = "Lesson\ndate of the lesson - " + dateLesson;
        for (int i = 0;  i < studentsPresent.length; i++){
            message += studentsPresent[i].toString() + "\n";
        }
        return message + "course - " + course + ", time - " + timeLesson + ", was home work - " + wasHoeWork + ", was exam - " + wasExam;

    }




    public LocalDate getDateLesson() {
        return dateLesson;
    }

    public void setDateLesson(LocalDate dateLesson) {
        this.dateLesson = dateLesson;
    }

    public Student[] getStudentsPresent() {
        return studentsPresent;
    }

    public void setStudentsPresent(Student[] studentsPresent) {
        this.studentsPresent = group.students;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public LocalTime getTimeLesson() {
        return timeLesson;
    }

    public void setTimeLesson(LocalTime timeLesson) {
        this.timeLesson = timeLesson;
    }

    public boolean isWasHoeWork() {
        return wasHoeWork;
    }

    public void setWasHoeWork(boolean wasHoeWork) {
        this.wasHoeWork = wasHoeWork;
    }

    public boolean isWasExam() {
        return wasExam;
    }

    public void setWasExam(boolean wasExam) {
        this.wasExam = wasExam;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
