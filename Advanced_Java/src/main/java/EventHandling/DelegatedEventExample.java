/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EventHandling;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Deepak Bhatta Kaji
 */
class ButtonHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked from delegated class!");
    }
}

public class DelegatedEventExample extends JFrame {

    JButton button;

    public DelegatedEventExample() {
        button = new JButton("Click Me");
        button.addActionListener(new ButtonHandler()); // Attaching listener from another class
        add(button);

        setSize(300, 200);
        setTitle("Delegated Event");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        DelegatedEventExample delegatedEventExample = new DelegatedEventExample();
    }
}
