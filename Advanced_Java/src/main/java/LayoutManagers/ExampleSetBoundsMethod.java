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
public class ExampleSetBoundsMethod {
    
    Frame frame;
    Button btn1, btn2;
    
    public ExampleSetBoundsMethod()
    {
        
        frame = new Frame();
        btn1 = new Button("Button 1");
        btn2 = new Button("Button 2");
        
        frame.add(btn1);
        frame.add(btn2);
        
        btn1.setBounds(50, 50, 100, 50);
        btn2.setBounds(50, 150, 100, 50);
        
        frame.setTitle("SetBound Method");
        frame.setLayout(null);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        ExampleSetBoundsMethod sbm = new ExampleSetBoundsMethod();
    }
    
}
