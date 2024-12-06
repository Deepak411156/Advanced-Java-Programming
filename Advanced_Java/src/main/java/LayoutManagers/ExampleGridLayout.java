/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LayoutManagers;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class ExampleGridLayout {

    Frame frame;
    Button b1, b2, b3, b4, b5,b6,b7,b8;

    public ExampleGridLayout() {
        frame = new Frame();
        frame.setLayout(new GridLayout(2, 4)); // 4 rows, 2 columns
        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
        b4 = new Button("Button 4");
        b5 = new Button("Button 5");
        //b6 = new Button("Button 6");
        //b7 = new Button("Button 7");
        //b8 = new Button("Button 8");
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
//        frame.add(b6);
        //frame.add(b7);
       // frame.add(b8);
        frame.setTitle("Grid Layout");
        frame.setSize(600, 600);
        frame.setVisible(true);
        
        frame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
    }

    public static void main(String[] args) {
        ExampleGridLayout gl = new ExampleGridLayout();

    }
}
