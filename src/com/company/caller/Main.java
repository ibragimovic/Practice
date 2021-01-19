package com.company.caller;

import com.company.dataTeacherStudent.Student;

import com.company.dataTeacherStudent.Teacher;

import com.company.dataCourseGroupLesson.Course;

import com.company.dataCourseGroupLesson.Group;

import com.company.dataCourseGroupLesson.Lesson;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {


            //    TASK A

    public static void main(String[] args) {
        Student student1 = new Student("03/12/1988", "Musaev", "Ibragim", "male", 32, 5.0, "Java");
        Student student2 = new Student("5/05/1998", "Olivier", "Giroud", "male", 22, 3.0, "Python");
        Student student3 = new Student("28/08/2018", "Abubakirova", "Aruujan", "female", 2, 5.0, "Java");
        Student student4 = new Student("15/01/2014", "Seitaliev", "Talgat", "male", 7, 5.0, "Java");
        Student student5 = new Student("30/04/2015", "Seitaliev", "Amir", "male", 6, 5.0, "Java");

        Student [] students = {student1, student2, student3, student4, student5};

        Teacher teacher = new Teacher("1996", "Temirbekova", "Sabina", "female", 24, "Java", 5);

        Course java = new Course("Java", "30/09/2020", "15879", teacher);

        Group java20 = new Group(students, java, "30/09/2020", 9, teacher);

        LocalDate localDate = LocalDate.of(2020, 12, 3);
        LocalTime localTime = LocalTime.of(20, 30);

        Lesson lesson17 = new Lesson(localDate, java20, students, java, localTime, true, true, teacher);

        System.out.println(lesson17);












    }
}
