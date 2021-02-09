package com.company;
import javax.swing.*;

public class MainWindow extends JFrame {

    private static MainWindow mainWindow;

    public MainWindow() {
        setTitle("Homework22");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        add(new DrawParabola1());
        setResizable(false);
        setVisible(true);
    }


    public static void main(String[] args) {
        mainWindow = new MainWindow();
    }

    public static void updateFrame(boolean whichFrame) {
        if (whichFrame) {
            mainWindow.add(new DrawParabola2());

        } else {
            mainWindow.add(new DrawParabola1());
        }
    }
}
