package com.company;

import java.time.LocalDate;
import java.time.LocalTime;

public class Lesson {
    LocalDate dateLesson;
    Group group;
    Student[] students;
    Course course;
    LocalTime timeLesson;
    boolean wasHoeWork;
    boolean wasExam;
    Teacher teacher;



    public Lesson(){}

    public Lesson (LocalDate dateLesson, Group group, Student[] students, Course course, LocalTime timeLesson, boolean wasHoeWork, boolean wasExam, Teacher teacher){
        this.dateLesson = dateLesson;
        this.group = group;
        this.students = students;
        this.course = course;
        this.timeLesson = timeLesson;
        this.wasHoeWork = wasHoeWork;
        this.wasExam = wasExam;
        this.teacher = teacher;
    }

    @Override
    public String toString(){
        String message = "Lesson\ndate of the lesson - " + dateLesson;
        for (int i = 0; i < students.length; i++){
            message += students[i].toString() + "\n";
        }
        return message + "course - " + course + ", time - " + timeLesson + ", was home work - " + wasHoeWork + ", was exam - " + wasExam + teacher.toString();

    }




    public LocalDate getDateLesson() {
        return dateLesson;
    }

    public void setDateLesson(LocalDate dateLesson) {
        this.dateLesson = dateLesson;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = group.students;
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
