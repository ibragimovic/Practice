package com.company.taskA;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static Object Song;

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("dir/song.txt");
            Scanner scn = new Scanner(fr);

            while (scn.hasNextLine()) {
                System.out.println(scn.nextLine());
            }
            fr.close();

//            FileWriter fw = new FileWriter("mysong.txt");
//            fw.write("Java\n");
//            fw.write("Hello\n");
//            fw.write("word!\n");
//            fw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Этого файла нет");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
