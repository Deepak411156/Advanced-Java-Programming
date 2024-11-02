/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EventHandling;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class StandardEventHandling extends JFrame implements ActionListener {

    JButton button;

    public StandardEventHandling() {
        button = new JButton("Click Me");
        button.addActionListener(this); // Registering listener to the button
        add(button);

        setSize(300, 200);
        setTitle("Standard Event");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked!");
    }

    public static void main(String[] args) {
        StandardEventHandling standardEventHandling = new StandardEventHandling();
    }
}
