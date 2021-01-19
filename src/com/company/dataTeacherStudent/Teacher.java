package com.company.dataTeacherStudent;

import com.company.person.Person;

public class Teacher extends Person {
    private String subjectIsTaught;
    private int yearWorkExperience;

    public Teacher(){}

    public Teacher(String dateOfBirth, String surname, String name, String gender, int age, String subjectIsTaught, int yearWorkExperience){
        super(dateOfBirth, surname, name, gender, age);
        this.subjectIsTaught = subjectIsTaught;
        this.yearWorkExperience = yearWorkExperience;
    }

    @Override
    public String toString(){
        String message = "Teacher\ndate of birth - " + dateOfBirth + ", surname - " + surname + ", name - " + name + ", gender - " + gender + ", age - " + age
                + "\nsubject - " + subjectIsTaught + ", work experience (years) - " + yearWorkExperience;
        return message;
    }

    public String getSubjectIsTaught() {
        return subjectIsTaught;
    }

    public void setSubjectIsTaught(String subjectIsTaught) {
        this.subjectIsTaught = subjectIsTaught;
    }

    public int getYearWorkExperience() {
        return yearWorkExperience;
    }

    public void setYearWorkExperience(int yearWorkExperience) {
        this.yearWorkExperience = yearWorkExperience;
    }
}
