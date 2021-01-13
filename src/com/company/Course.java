package com.company;

public class Course {
    String name;
    String dateOfCreation;
    String ID;
    String nameOfTeacher;

    public Course(){}

    public Course(String name, String dateOfCreation, String ID, String nameOfTeacher){
        this.name = name;
        this.dateOfCreation = dateOfCreation;
        this.ID = ID;
        this.nameOfTeacher = nameOfTeacher;
    }

    @Override
    public String toString(){
        return "Course\nname - " + name + ", date - " + dateOfCreation + ", ID - " + ID + ", name of the teacher - " + nameOfTeacher;
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

    public String getNameOfTeacher() {
        return nameOfTeacher;
    }

    public void setNameOfTeacher(String nameOfTeacher) {
        this.nameOfTeacher = nameOfTeacher;
    }






}
