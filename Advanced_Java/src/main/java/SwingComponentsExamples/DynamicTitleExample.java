/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SwingComponentsExamples;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Deepak Bhatta Kaji
 */

public class DynamicTitleExample extends JFrame {

    public DynamicTitleExample() {
        // Set initial title
        setTitle("Initial Frame Title");

        // Set layout and close operation
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a button to change the title
        JButton changeTitleButton = new JButton("Change Title");
        changeTitleButton.setBounds(50, 50, 150, 30); // Set position and size of the button

        // Add an ActionListener to the button
        changeTitleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Change the frame's title dynamically
                setTitle("New Dynamic Title");
            }
        });

        // Add the button to the frame
        add(changeTitleButton);

        // Set size of the frame
        setSize(300, 200);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true); // Show the frame
    }

    public static void main(String[] args) {
        // Run the application
        SwingUtilities.invokeLater(() -> new DynamicTitleExample());
    }
}
