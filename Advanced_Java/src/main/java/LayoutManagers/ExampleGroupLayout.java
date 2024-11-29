/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LayoutManagers;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

/**
 *
 * @author deepakbhattakaji
 */
public class ExampleGroupLayout {

    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("GroupLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create components
        JLabel lblUsername = new JLabel("Username:");
        JTextField txtUsername = new JTextField();
        JLabel lblPassword = new JLabel("Password:");
        JPasswordField txtPassword = new JPasswordField();
        JButton btnLogin = new JButton("Login");
        JButton btnCancel = new JButton("Cancel");

        // Create a container panel
        JPanel panel = new JPanel();

        // Create GroupLayout
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        // Automatically add gaps between components
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Define horizontal group
       
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                .addComponent(lblUsername)
                                .addComponent(lblPassword))
                        .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                .addComponent(txtUsername)
                                .addComponent(txtPassword)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnLogin)
                                        .addComponent(btnCancel)))
        );

        // Define vertical group
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(lblUsername)
                                .addComponent(txtUsername))
                        .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(lblPassword)
                                .addComponent(txtPassword))
                        .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(btnLogin)
                                .addComponent(btnCancel))
        );

        // Add panel to frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
