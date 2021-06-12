package com.company.TaskB;

import com.company.TaskB.Animal;

public class Dog extends Animal {
    public void bark() {
        System.out.println("Bark!");
    }

    public Dog() {
    }

    public Dog(int age) {
        super(age);
    }
}


