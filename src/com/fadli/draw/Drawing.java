package com.fadli.draw;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.Graphics;

public class Drawing extends Applet {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Applet drawing = new Drawing();

        frame.getContentPane().add(drawing, BorderLayout.CENTER);
        frame.setSize(new Dimension(500, 500));
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawString("hello", 40, 30);
    }
}
