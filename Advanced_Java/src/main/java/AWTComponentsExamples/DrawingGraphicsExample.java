/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AWTComponentsExamples;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.QuadCurve2D;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class DrawingGraphicsExample extends Frame {

    public DrawingGraphicsExample() {
        setTitle("AWT Graphics Example");
        setSize(600, 600);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        //g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.RED);
        g2.drawLine(50, 100, 300, 100);

        g2.setColor(Color.BLUE);
        g2.drawRect(50, 150, 200, 100);
        g2.fillRect(300, 150, 200, 100);

        g2.setColor(Color.GREEN);
        g2.drawOval(50, 300, 200, 100);
        g2.fillOval(300, 300, 200, 100);

        g2.setColor(Color.BLACK);
        g2.draw(new QuadCurve2D.Float(100, 500, 400, 200, 800, 800));

        g2.setColor(Color.RED);
        g2.setFont(new Font("Serif", Font.BOLD, 20));
        g2.drawString("Hello! Welcome to Knightec Nepal", 50, 50);

        g2.setStroke(new BasicStroke(5));
        g2.setColor(Color.PINK);
        g2.drawLine(40, 60, 350, 60);

    }

    public static void main(String[] args) {
        new DrawingGraphicsExample();
    }

}
