package com.company.taskB;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainTaskB {
    private static Object SongB;
    public static void main(String[] args) throws IOException {

//        FileWriter fileWriter = new FileWriter("itsMyLife.txt");
//        fileWriter.write("It's my life" + "\nBon Jovi" + "\nThis ain't a song for the broken-hearted\n" +
//                "No silent prayer for faith-departed\n" +
//                "And I ain't gonna be just a face in the crowd\n" +
//                "You're gonna hear my voice when I shout it out loud\n" +
//                "It's my life\n" +
//                "It's now or never\n" +
//                "But I ain't gonna live forever\n" +
//                "I just want to live while I'm alive\n" +
//                "My heart is like an open highway\n" +
//                "Like Frankie said, \"I did it my way\"\n" +
//                "\nI just want to live while I'm alive\n...." + "\nrock" );
//
//        fileWriter.close();

        try {
            FileReader fr = new FileReader("itsMyLife.txt");
            Scanner scn = new Scanner(fr);

            while (scn.hasNextLine()) {
                System.out.println(scn.nextLine());
            }
            fr.close();

        } catch (FileNotFoundException e) {
            System.out.println("Этого файла нет");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }



    }
}
