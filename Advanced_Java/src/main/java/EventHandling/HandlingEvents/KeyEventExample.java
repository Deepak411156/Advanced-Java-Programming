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
public class KeyEventExample extends JFrame implements KeyListener {
    
    public KeyEventExample() {
        addKeyListener(this);  // Register KeyListener
        setTitle("Key Event");
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed: " + e.getKeyChar());
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released: " + e.getKeyChar());
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }
    
    public static void main(String[] args) {
        KeyEventExample keyEventExample = new KeyEventExample();
    }
}
