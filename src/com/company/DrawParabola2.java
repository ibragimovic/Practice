package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public final class DrawParabola2 extends JPanel {

    private final JButton changeButton;

    public DrawParabola2() {
        setBackground(Color.BLACK);
        changeButton = new JButton("Change");
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawGraphic(g);
        drawFunction1(g);
        isClicked();
    }

    public void drawGraphic(Graphics g) {
        g.setColor(Color.RED);
        Dimension size = getSize();
        g.drawLine(size.width / 2, 0, size.width / 2, size.height);
        g.drawLine(0, size.height / 2, size.width, size.height / 2);

    }

    public void isClicked() {


        changeButton.setBounds(300, 300, 100, 30);
        changeButton.setBackground(Color.RED);
        changeButton.setFocusPainted(false);
        changeButton.setFont(new Font("Ink Free", Font.BOLD, 15));
        this.add(changeButton);

        changeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == getChangeButton()) {
                    setVisible(false);
                    MainWindow.updateFrame(false);
                }
            }
        });
    }

    public void drawFunction1(Graphics g) {
        g.setColor(Color.RED);
        Dimension size = getSize();


        for (double x = -10; x <= 10; x = x + 0.1) {

            double y = x * x * x;

            int xx = (int) Math.round(size.getWidth() / 2 + x * size.getWidth() / 10);
            int yy = (int) Math.round(size.getHeight() / 2 - y * size.getHeight() / 10);
            g.fillOval(xx, yy, 5, 5);

        }
    }

    public JButton getChangeButton() {
        return changeButton;
    }
}