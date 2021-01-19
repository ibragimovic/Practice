package com.company.dataTeacherStudent;

import com.company.person.Person;

public class Student extends Person {

    private double academicPerformance;
    private String studentStudyDirection;


    public Student(){}

    public Student(String dateOfBirth, String surname, String name, String gender, int age, double academicPerformance, String studentStudyDirection){
        super(dateOfBirth, surname, name, gender, age);
        this.academicPerformance = academicPerformance;
        this.studentStudyDirection = studentStudyDirection;
    }

    @Override
    public String toString(){
        String message = "Student\ndate of birth - " + dateOfBirth + ", surname - " + surname + ", name - " + name + ", gender - " + gender + ", age - " + age
                + ", academic performance - " + academicPerformance + ", direction of study - " + studentStudyDirection;
        return message;
    }

    public double getAcademicPerformance() {
        return academicPerformance;
    }

    public void setAcademicPerformance(double academicPerformance) {
        this.academicPerformance = academicPerformance;
    }

    public String getStudentStudyDirection() {
        return studentStudyDirection;
    }

    public void setStudentStudyDirection(String studentStudyDirection) {
        this.studentStudyDirection = studentStudyDirection;
    }
}
