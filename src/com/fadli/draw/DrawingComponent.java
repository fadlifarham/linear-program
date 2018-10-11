package com.fadli.draw;

import java.awt.Graphics2D;
import java.awt.Graphics;
import javax.swing.JComponent;
import java.awt.Rectangle;

public class DrawingComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Rectangle rect1 = new Rectangle(5, 5, 100, 200);
        g2.draw(rect1);
    }
}
