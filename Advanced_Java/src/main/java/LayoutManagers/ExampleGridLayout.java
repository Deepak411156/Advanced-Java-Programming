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
public class ExampleGridLayout {

    Frame frame;
    Button b1, b2, b3;

    public ExampleGridLayout() {
        frame = new Frame();
        frame.setLayout(new GridLayout(2, 2)); // 2 rows, 2 columns
        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.setTitle("Grid Layout");
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        ExampleGridLayout gl = new ExampleGridLayout();

    }
}