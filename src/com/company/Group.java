package com.company;

public class Group {

    Student[] students;
    Course course;
    String dateOfBeginning;
    int durationInMonths;
    Teacher teacher;


    public Group (){}

    public Group(Student[] students, Course course, String dateOfBeginning, int durationInMonths, Teacher teacher){
        this.students = students;
        this.course = course;
        this.dateOfBeginning = dateOfBeginning;
        this.durationInMonths = durationInMonths;
        this.teacher = teacher;
    }

    @Override
    public String toString(){
        String message = "Group:\nStudents:\n";
        for (Student student : students){
            message += student;
        }
        message += course.toString() + ", date of the beginning - " + dateOfBeginning + ", duration - " + durationInMonths + teacher;
        return message;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getDateOfBeginning() {
        return dateOfBeginning;
    }

    public void setDateOfBeginning(String dateOfBeginning) {
        this.dateOfBeginning = dateOfBeginning;
    }

    public int getDurationInMonths() {
        return durationInMonths;
    }

    public void setDurationInMonths(int durationInMonths) {
        if(this.durationInMonths > 0){
            this.durationInMonths = durationInMonths;
        }

    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
