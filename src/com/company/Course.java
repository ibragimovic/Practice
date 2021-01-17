package com.company;

public class Course {
    String name;
    String dateOfCreation;
    String ID;
    Teacher teacher;

    public Course(){}

    public Course(String name, String dateOfCreation, String ID, Teacher teacher){
        this.name = name;
        this.dateOfCreation = dateOfCreation;
        this.ID = ID;
        this.teacher = teacher;
    }

    @Override
    public String toString(){
        return "Course\nname - " + name + ", date - " + dateOfCreation + ", ID - " + ID + ", name of the teacher - " + teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
