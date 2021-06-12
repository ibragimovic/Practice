package com.company.TaskB;

import com.company.TaskB.Animal;

public class Cat extends Animal {
    public void mew() {
        System.out.println("Mew!");
    }

    public Cat(int age) {
        super(age);
    }

    public Cat() {}
}
