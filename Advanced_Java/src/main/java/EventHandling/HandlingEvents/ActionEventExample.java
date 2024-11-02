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

public class ActionEventExample extends JFrame implements ActionListener {
    JButton button;

    public ActionEventExample() {
        button = new JButton("Click Me");
        button.addActionListener(this); // Register ActionListener
        add(button);
        setSize(200, 200);
        setTitle("action Event");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked!");
    }

    public static void main(String[] args) {
        ActionEventExample actionEventExample = new ActionEventExample();
    }
}
