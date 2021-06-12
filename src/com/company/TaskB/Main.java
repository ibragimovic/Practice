package com.company.TaskB;

import com.company.TaskB.Animal;
import com.company.TaskB.Cat;
import com.company.TaskB.Dog;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();


        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 10; i++){
            int currentIndex = ((list.size() - 1) / 2) + i;
            list.add(currentIndex, new Object());
        }

        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);

        LinkedList<Animal> animals = new LinkedList<>();

        //Random random = new Random();

        for(int i = 0; i < 100; i++) {
            if(i < 50) {
                animals.add(new Cat());
            } else {
                animals.add(new Dog());
            }
        }





        int catCount = 0;
        for(Animal animal : animals) {
            if(animal instanceof Cat) {
                catCount++;

                if (catCount == 5) {
                    //Удаление
                    catCount = 0;
                }

            }
        }

        for (int i = 0; i < animals.size() - 1; i ++) {
            if (animals.get(i) instanceof Cat && animals.get(i + 1) instanceof Dog) {
                //Добавление в новый массив
            }
        }

        Random rnd = new Random();
        for(int i = 0; i < 10; i++) {
            int random = rnd.nextInt(2);
            if (random == 0) {
                animals.add(new Cat());
            } else {
                animals.add(new Dog());
            }
        }
        System.out.println(animals);
        System.out.println("================");
        //Пример добавления в новый список Линкедлист
        LinkedList<Animal> newAnimals = new LinkedList<>();
        for (Animal animal : animals) {
            if(animal instanceof Dog) {
                newAnimals.add(animal);
            }
        }
        System.out.println(newAnimals);


        LinkedList<Animal> new2Animals = (LinkedList<Animal>) animals.clone();

        System.out.println(newAnimals);
    }
}
