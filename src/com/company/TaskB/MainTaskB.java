package com.company.TaskB;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class MainTaskB {
    public static void main(String[] args) {

        //Создаем список животных и заполняем по 50 кошек и собак
        Random random = new Random();
        LinkedList <Animal> animals = new LinkedList<>();
        for(int i = 0; i < 100; i ++) {
            if (i < 50) {
                animals.add(new Cat(random.nextInt(10)));
            } else {
                animals.add(new Dog(random.nextInt(15)));
            }
        }
        System.out.println(animals.size());


        //Удаление каждую 5-ю кошку из списка

        for (int i = 0; i < animals.size(); i++) {
            int countCat = 0;
            if (animals.get(i) instanceof Cat) {
                countCat++;
                if (countCat == 5){
                    animals.remove(i);
                    countCat = 0;
                }
                else break;
            }
        }
        System.out.println(animals.size());

        int dog = 0, cat = 0, mouse = 0;
        for (Animal animal: animals) {
            if (animal instanceof Dog) {
                dog++;
            }else if (animal instanceof Mouse) {
                mouse++;
            }else  if(animal instanceof Cat){
                cat++;
            }
        }

        System.out.println(dog + " " + cat +" " + mouse);

        //Добавление после каждой 3-й собаки мыкшу
        for (int i = 0; i < animals.size(); i++) {
            int counterDog = 0;
            if (animals.get(i) instanceof Dog) {
                counterDog ++;
                if (counterDog == 3) {
                    animals.add(new Mouse(random.nextInt(3)));
                }
            }
        }

        //Нахождение оказавшихся рядом кошек и мышек, перемещение их в новый LinkedList.
        LinkedList <Animal> catMouse = new LinkedList<>();
        for (int i = 0; i < animals.size() - 1; i ++) {
            if (animals.get(i) instanceof Cat && animals.get(i + 1) instanceof Mouse) {
                catMouse.add(animals.get(i));
                catMouse.add(animals.get(i + 1));
            }
        }

        //Копирование списка в ArrayList
        ArrayList<Animal> animals1 = new ArrayList<>();
        for (int i = 0; i < animals.size(); i++) {
            animals1.add(animals.get(i));
        }

        // Получение сумму возрастов отдельно по мышкам, кошкам и собакам.

        int countAgeCat = 0;
        int countAgeDog = 0;
        int countAgeMouse = 0;

        for (Animal animal : animals) {
            if (animal instanceof  Cat) {
                countAgeCat += animal.getAge();
            }
            else if (animal instanceof Dog) {
                countAgeDog += animal.getAge();
            }
            else countAgeMouse += animal.getAge();
        }
        System.out.println("Сумма возрастов отдельно по кошкам: " + countAgeCat);
        System.out.println("Сумма возрастов отдельно по собакам: " + countAgeDog);
        System.out.println("Сумма возрастов отдельно по мышкам: " + countAgeMouse);

















    }
}
