package com.company.taskA;

import com.company.TaskB.Animal;
import com.company.TaskB.Cat;
import com.company.TaskB.Dog;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class MainTaskA {

    public static void main(String[] args) {

        //Замеры по  ArrayList
        //Добавление в середину списка 100 кошек
       ArrayList<Cat> catsArrayList = new ArrayList<>();

       for(int i = 0; i < 1000000; i++){
           catsArrayList.add(new Cat());
       }

        long startTimeAddCatMiddle = System.currentTimeMillis();
        for(int i = 0; i < 100; i++){
            int currentIndex = ((catsArrayList.size() - 1) / 2) + i;
            catsArrayList.add(currentIndex, new Cat());
        }
        long endTimeAddCatMiddle = System.currentTimeMillis();
        long timeAddCatMiddleArrayList = endTimeAddCatMiddle - startTimeAddCatMiddle;
        System.out.println("Время добавление 100 кошек в середину ArrayList списка составила: " + timeAddCatMiddleArrayList + " миллисекунд");
        System.out.println("Размер ArrayList списка после добавление в середину 100 кошек составило " + catsArrayList.size());
        System.out.println("____________________________________________________________________________________________");

        //-------------------------------------------------------------------------------------------------------------------------------------
        //Добавление в начало списка 100 кошек
        long startTimeAddCatBeginning = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            catsArrayList.add(i, new Cat());
        }
        long endTimeAddCatBeginning = System.currentTimeMillis();
        long timeAddCatBeginningArrayList = endTimeAddCatBeginning - startTimeAddCatBeginning;
        System.out.println("Время добавление 100 кошек в начало ArrayList списка составила: " + timeAddCatBeginningArrayList + " миллисекунд");
        System.out.println("Размер ArrayList списка после добавление в начало 100 кошек составило " + catsArrayList.size());
        System.out.println("____________________________________________________________________________________________");

        //_____________________________________________________________________________________________________________________________________
        //Добавление 100 кошек в конец списка
        long startTimeAddCatEnding = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            catsArrayList.add( new Cat());
        }
        long endTimeAddCatEnding = System.currentTimeMillis();
        long timeAddCatEndingArrayList = endTimeAddCatEnding - startTimeAddCatEnding;
        System.out.println("Время добавление 100 кошек в конец ArrayList списка составила: " + timeAddCatEndingArrayList + " миллисекунд");
        System.out.println("Размер ArrayList списка после добавление в конец 100 кошек составило " + catsArrayList.size());
        System.out.println("____________________________________________________________________________________________");

        //______________________________________________________________________________________________________________________________________
        //Считать (get) с середины с замером

        long startTimeGetCatsFromMiddleArrayList = System.currentTimeMillis();
        for (int i = 0; i < (catsArrayList.size() - 1) / 2; i++) {
            int index = ((catsArrayList.size() - 1) / 2) + i;
            catsArrayList.get(index);
        }
        long endTimeGetCatsFromMiddleArrayList = System.currentTimeMillis();
        long timeGetCatsFromMiddleArrayList = endTimeGetCatsFromMiddleArrayList - startTimeGetCatsFromMiddleArrayList;
        System.out.println("Время считывания с середины ArrayList до конца списка составила: " + timeGetCatsFromMiddleArrayList + " миллисекунд");
        System.out.println("____________________________________________________________________________________________");

        //______________________________________________________________________________________________________________________________________
        //Считать (get) с конца до начала списка с замером

        long startTimeGetCatsFromEndingArrayList = System.currentTimeMillis();
        for (int i = catsArrayList.size() - 1; i >= 0; i--) {
            catsArrayList.get(i);
        }
        long endTimeGetCatsFromEndingArrayList = System.currentTimeMillis();
        long timeGetCatsFromEndingArrayList = endTimeGetCatsFromEndingArrayList- startTimeGetCatsFromEndingArrayList;
        System.out.println("Время считывания с конца ArrayList до начала списка составила: " + timeGetCatsFromEndingArrayList + " миллисекунд");
        System.out.println("____________________________________________________________________________________________");

        //______________________________________________________________________________________________________________________________________
        //Удаление в середине 100 кошек
        long startTimeRemoveCatsFromMiddleArrayList = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            int index = ((catsArrayList.size() - 1) / 2) + i;
            catsArrayList.remove(index);
        }
        long endTimeRemoveCatsFromMiddleArrayList = System.currentTimeMillis();
        long timeRemoveCatsFromMiddleArrayList = endTimeRemoveCatsFromMiddleArrayList - startTimeRemoveCatsFromMiddleArrayList;
        System.out.println("Время удаления 100 кошек с середины ArrayList списка составила: " + timeRemoveCatsFromMiddleArrayList + " миллисекунд");
        System.out.println("Размер ArrayList списка после удаления с конца 100 кошек составило " + catsArrayList.size());
        System.out.println("____________________________________________________________________________________________");


        //Удаление в начале 100 кошек
        long startTimeRemoveCatsFromBeginningArrayList = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            catsArrayList.remove(i);
        }
        long endTimeRemoveCatsFromBeginningArrayList = System.currentTimeMillis();
        long timeRemoveCatsFromBeginningArrayList = endTimeRemoveCatsFromBeginningArrayList - startTimeRemoveCatsFromBeginningArrayList;
        System.out.println("Время удаления 100 кошек в начале ArrayList списка составила: " + timeRemoveCatsFromBeginningArrayList + " миллисекунд");
        System.out.println("Размер ArrayList списка после удаления в начале 100 кошек составило " + catsArrayList.size());
        System.out.println("____________________________________________________________________________________________");



        //======================================================================================================================================
        //Замеры по LikedList
        //Добавление в середину списка 100 кошек

        LinkedList<Cat> catsLinkedList= new LinkedList<>();

        for (int i = 0; i < 1000000; i++){
            catsLinkedList.add(new Cat());
        }

        long startTimeAddCatMiddleLinkedList = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            int currentIndex = ((catsLinkedList.size() - 1) / 2) + i;
            catsLinkedList.add(currentIndex, new Cat());
        }
        long endTimeAddCatMiddleLinkedList = System.currentTimeMillis();
        long timeAddCatMiddleLinkedList = endTimeAddCatMiddleLinkedList - startTimeAddCatMiddleLinkedList;
        System.out.println("Время добавление 100 кошек в середину LinkedList списка составила: " + timeAddCatMiddleLinkedList + " миллисекунд");
        System.out.println("Размер LinkedList списка после добавления 100 кошек составило " + catsLinkedList.size());


        //-------------------------------------------------------------------------------------------------------------------------------------
        //Добавление в начало списка 100 кошек
        long startTimeAddCatBeginningLinkedList = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            catsLinkedList.add(i, new Cat());
        }
        long endTimeAddCatBeginningLinkedList = System.currentTimeMillis();
        long timeAddCatBeginningLinkedList = endTimeAddCatBeginningLinkedList - startTimeAddCatBeginningLinkedList;
        System.out.println("Время добавление 100 кошек в начало LinkedList списка составила: " + timeAddCatBeginningLinkedList + " миллисекунд");
        System.out.println("Размер LinkedList списка после добавление в начало 100 кошек составило " + catsLinkedList.size());
        System.out.println("____________________________________________________________________________________________");

        //Добавление 100 кошек в конец списка
        long startTimeAddCatEndingLinkedList = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            catsLinkedList.add( new Cat());
        }
        long endTimeAddCatEndingLinkedList = System.currentTimeMillis();
        long timeAddCatEndingLinkedList = endTimeAddCatEndingLinkedList - startTimeAddCatEndingLinkedList;
        System.out.println("Время добавление 100 кошек в конец LinkedList списка составила: " + timeAddCatEndingLinkedList + " миллисекунд");
        System.out.println("Размер LinkedList списка после добавление в конец 100 кошек составило " + catsLinkedList.size());
        System.out.println("____________________________________________________________________________________________");

        //______________________________________________________________________________________________________________________________________
        //Считать (get) с середины с замером
//        long startTimeGetCatsFromMiddleLinkedList = System.currentTimeMillis();
//        for (int k = 0; k < (catsLinkedList.size() / 2) - 1; k++) {
//            int index = ((catsLinkedList.size() / 2) - 1) + k;
//            if (catsLinkedList.get(index) == null) {
//                catsLinkedList.get(index);
//            }
//        }
//        long endTimeGetCatsFromMiddleLinkedList = System.currentTimeMillis();
//        long timeGetCatsFromMiddleLinkedList = endTimeGetCatsFromMiddleLinkedList - startTimeGetCatsFromMiddleLinkedList;
//        System.out.println("Время считывания с середины LinkedList до конца списка составила: " + timeGetCatsFromMiddleLinkedList + " миллисекунд");
//        System.out.println("____________________________________________________________________________________________");

        //______________________________________________________________________________________________________________________________________
        //Считать (get) с конца до начала списка с замером

//        long startTimeGetCatsFromEndingLinkedList = System.currentTimeMillis();
//        for (int i = catsLinkedList.size() - 1; i >= 0; i--) {
//            catsLinkedList.get(i);
//        }
//        long endTimeGetCatsFromEndingLinkedList = System.currentTimeMillis();
//        long timeGetCatsFromEndingLinkedList = endTimeGetCatsFromEndingLinkedList- startTimeGetCatsFromEndingLinkedList;
//        System.out.println("Время считывания с конца LinkedList до начала списка составила: " + timeGetCatsFromEndingArrayList + " миллисекунд");
//        System.out.println("____________________________________________________________________________________________");



        //______________________________________________________________________________________________________________________________________
        //Удаление в середине 100 кошек
        long startTimeRemoveCatsFromMiddleLinkedList = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            int index = ((catsArrayList.size() - 1) / 2) + i;
            catsLinkedList.remove(index);
        }
        long endTimeRemoveCatsFromMiddleLinkedList = System.currentTimeMillis();
        long timeRemoveCatsFromMiddleLinkedList = endTimeRemoveCatsFromMiddleLinkedList - startTimeRemoveCatsFromMiddleLinkedList;
        System.out.println("Время удаления 100 кошек с середины LinkedListList списка составила: " + timeRemoveCatsFromMiddleLinkedList + " миллисекунд");
        System.out.println("Размер LinkedList списка после удаления с середины 100 кошек составило " + catsLinkedList.size());
        System.out.println("____________________________________________________________________________________________");

        //Удаление в начале 100 кошек
        long startTimeRemoveCatsFromBeginningLinkedList = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            catsLinkedList.remove(i);
        }
        long endTimeRemoveCatsFromBeginningLinkedList = System.currentTimeMillis();
        long timeRemoveCatsFromBeginningLinkedList = endTimeRemoveCatsFromBeginningLinkedList - startTimeRemoveCatsFromBeginningLinkedList;
        System.out.println("Время удаления 100 кошек в начале LinkedList списка составила: " + timeRemoveCatsFromBeginningLinkedList + " миллисекунд");
        System.out.println("Размер LinkedList списка после удаления в начале 100 кошек составило " + catsLinkedList.size());
        System.out.println("____________________________________________________________________________________________");



    }
}
