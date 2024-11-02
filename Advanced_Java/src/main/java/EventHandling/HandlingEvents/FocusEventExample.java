/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EventHandling.HandlingEvents;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class FocusEventExample extends JFrame implements FocusListener {
    
    JTextField textField;
    
    public FocusEventExample() {
        textField = new JTextField("Click to focus", 20);
        textField.addFocusListener(this);  // Register FocusListener
        add(textField);
        setSize(300, 100);
        setTitle("Focus Event");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    @Override
    public void focusGained(FocusEvent e) {
        System.out.println("Focus Gained");
    }
    
    @Override
    public void focusLost(FocusEvent e) {
        System.out.println("Focus Lost");
    }
    
    public static void main(String[] args) {
        FocusEventExample focusEventExample = new FocusEventExample();
    }
}
