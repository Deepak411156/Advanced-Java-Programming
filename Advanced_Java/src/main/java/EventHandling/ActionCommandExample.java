/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EventHandling;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class ActionCommandExample extends JFrame implements ActionListener {

    JButton button1, button2;

    public ActionCommandExample() {
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");

        button1.setActionCommand("B1"); // Setting action command
        button2.setActionCommand("B2");

        button1.addActionListener(this);
        button2.addActionListener(this);

        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);

        setSize(300, 200);
        setTitle("Action Command Event");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand(); // Retrieving the action command
        if (command.equals("B1")) {
            System.out.println("Button 1 clicked!");
        } else if (command.equals("B2")) {
            System.out.println("Button 2 clicked!");
        }
    }

    public static void main(String[] args) {
        ActionCommandExample actionCommandExample = new ActionCommandExample();
    }
}
