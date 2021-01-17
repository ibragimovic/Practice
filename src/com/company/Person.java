package com.company;

public class Person {
    String dateOfBirth;
    String surname;
    String name;
    String gender;
    int age;

    public Person(){}

    public Person(String dateOfBirth, String surname, String name, String gender, int age) {
        this.dateOfBirth = dateOfBirth;
        this.surname = surname;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString(){
        String message = "Person\ndate of birth - " + dateOfBirth + ", surname - " + surname + ", name - " + name + ", gender - " + gender + ", age - " + age;
        return message;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(this.age > 0){
            this.age = age;
            return;
        }
        return;
    }
}
