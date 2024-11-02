/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SwingComponentsExamples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Deepak Bhatta Kaji
 */

public class SimpleFormTextFields extends JFrame {

    public SimpleFormTextFields() {
        // Create frame with title
        super("Swing - Simple Form");

        // Set the layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Padding for components

        // Create components
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);

        JLabel bioLabel = new JLabel("Bio:");
        JTextArea bioArea = new JTextArea(5, 20);
        JScrollPane bioScrollPane = new JScrollPane(bioArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        JButton submitButton = new JButton("Submit");

        // Add components to the frame
        // Name Label
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(nameLabel, gbc);

        // Name Field
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(nameField, gbc);

        // Password Label
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(passwordLabel, gbc);

        // Password Field
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(passwordField, gbc);

        // Bio Label
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.NORTH; // Align label to top of the text area
        add(bioLabel, gbc);

        // Bio Text Area with Scroll Pane
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(bioScrollPane, gbc);

        // Submit Button
        gbc.gridx = 1;
        gbc.gridy = 3;
       gbc.anchor = GridBagConstraints.EAST; // Align button to the right
        add(submitButton, gbc);

        // Action Listener for Submit Button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String password = new String(passwordField.getPassword());
                String bio = bioArea.getText();

                // Display the input
                JOptionPane.showMessageDialog(SimpleFormTextFields.this,
                        "Name: " + name + "\nPassword: " + password + "\nBio: " + bio,
                        "Submitted Information", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Frame settings
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
//        pack(); // Adjusts the window to fit components
        setLocationRelativeTo(null); // Centers the window on the screen
        setVisible(true);

    }

    public static void main(String[] args) {
        // Run the application
        SimpleFormTextFields simpleFormTextFields = new SimpleFormTextFields();
    }
}
