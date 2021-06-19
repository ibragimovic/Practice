package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
enum Transport{
    PLANE(600), TRAIN(80), AUTOMOBILE(50);

    int speed;

    Transport(int s) {
        speed = s;
    }
}

public class Main {

    public static void main(String[] args) {

        Transport tp = Transport.PLANE;
        if(tp == Transport.PLANE) {
            System.out.println("Первым делом, первым делом самолеты, ну а девушки, а девушки потом");
        }
        Transport allTransports [] = Transport.values();

        for (Transport t : allTransports) {
            System.out.println(t);
        }
        System.out.println(Transport.AUTOMOBILE.speed);

        Transport tp2 = Transport.AUTOMOBILE;
        System.out.println(tp2.ordinal());

        if(tp.ordinal() < 2){
            System.out.println("Not an automobile");
        }








        Random rnd = new Random();

        int[] a = new int[5];
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();


        for(int i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt(2);
            list.add(rnd.nextInt(2));
            arrayList.add(rnd.nextInt(2));
            System.out.printf("a[%d] = %d\n", i, a[i]);
        }
        System.out.println("___________________");

        int [] newArray = sort(a);
        for (int i = 0; i < newArray.length; i++) {
            System.out.printf("a[%d] = %d\n", i, a[i]);
        }
        System.out.println("___________________");

        System.out.println(list);
        System.out.println("___________________");
        list = sort(list);
        System.out.println(list);
        System.out.println("___________________");

        System.out.println(arrayList);
        System.out.println("___________________");
        arrayList = sort(arrayList);
        System.out.println(arrayList);






    }

    public static int[] sort(int [] a) {
        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                int nextIndex = j + 1;
                if(a[j] > a[nextIndex]) {
                    int t = a[j];
                    a[j] = a[nextIndex];
                    a[nextIndex] = t;
                }
            }
        }
        return a;
    }

    public static ArrayList <Integer> sort (ArrayList <Integer> list) {

        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < list.size() - i - 1; j++) {
                int nextIndex = j + 1;
                if(list.get(j) > list.get(nextIndex)) {
                    int temp = list.get(j);
                    list.set(j, list.get(nextIndex));
                    list.set(nextIndex, temp);
                }
            }
        }
        return list;
    }

    public static LinkedList<Integer> sort (LinkedList<Integer> list) {
        LinkedList<Integer> result = new LinkedList<>();
        for(Integer number : list) {
            if(number == 0) {
                result.addFirst(number);
            } else if (number == 1) {
                result.addLast(number);
            }
        }
        return result;
    }

}
