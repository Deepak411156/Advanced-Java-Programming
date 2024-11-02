/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LayoutManagers;

import java.awt.*;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class ExampleBorderLayout {

    Frame frame;
    Button btn1, btn2, btn3, btn4, btn5;

    public ExampleBorderLayout() {
        frame = new Frame();
        frame.setLayout(new BorderLayout());

        btn1 = new Button("North");
        btn2 = new Button("South");
        btn3 = new Button("East");
        btn4 = new Button("West");
        btn5 = new Button("Center");

        frame.add(btn1, BorderLayout.NORTH);
        frame.add(btn2, BorderLayout.SOUTH);
        frame.add(btn3, BorderLayout.EAST);
        frame.add(btn4, BorderLayout.WEST);
        frame.add(btn5, BorderLayout.CENTER);

        frame.setTitle("Border Layout");
        frame.setSize(300, 200);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        ExampleBorderLayout bl = new ExampleBorderLayout();
    }
}
