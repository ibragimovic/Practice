package com.company;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("03/12/1988", "Musaev", "Ibragim", "male", 32);
        Student student2 = new Student("5/05/1998", "Olivier", "Giroud", "male", 22);
        Student student3 = new Student("28/08/2018", "Abubakirova", "Aruujan", "female", 2);
        Student student4 = new Student("15/01/2014", "Seitaliev", "Talgat", "male", 7);
        Student student5 = new Student("30/04/2015", "Seitaliev", "Amir", "male", 6);

        Student [] students = {student1, student2, student3, student4, student5};
        Student [] studentsPresent = new Student[students.length];

        studentsPresent[0] = student1;
        studentsPresent[1] = null;
        studentsPresent[2] = student3;
        studentsPresent[3] = null;
        studentsPresent[4] = student5;




        Course java = new Course("Java", "30/09/2020", "15879", "Temirbekova Sabina");

        Group java20 = new Group(students, java, "30/09/2020", 9);

//       Lesson lesson17 = new Lesson(LocalDate.now(), studentsPresent, java, LocalTime.now(), true, true);

//        System.out.println(lesson17);
//        System.out.println(java);













    }
}
