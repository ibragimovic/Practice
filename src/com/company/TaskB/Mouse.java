package com.company.TaskB;

public class Mouse extends Animal{
    public void eat() {
        System.out.println("Грызет!");
    }

    public Mouse() {
    }

    public Mouse(int age) {
        super(age);
    }
}
