package com.fadli.draw;

import javax.swing.*;
import java.awt.Rectangle;

public class Graphics extends JComponent {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setSize(640, 640);
        window.setTitle("JFrame");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        Rectangle rectangle = new Rectangle(5, 10, 300, 100);
        DrawingComponent drawingComponent = new DrawingComponent();
        window.add(drawingComponent);
    }
}
