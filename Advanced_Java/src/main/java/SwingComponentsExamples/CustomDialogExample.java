/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SwingComponentsExamples;

import java.awt.FlowLayout;
import javax.swing.*;
/**
 *
 * @author Deepak Bhatta Kaji
 */
public class CustomDialogExample {
    public static void main(String[] args) {
        JDialog dialog = new JDialog();
dialog.setTitle("Custom Dialog");
dialog.setSize(300, 150);
dialog.setLayout(new FlowLayout());

JLabel label = new JLabel("This is a custom dialog.");
JButton closeButton = new JButton("Close");
closeButton.addActionListener(e -> dialog.dispose());

dialog.add(label);
dialog.add(closeButton);
dialog.setModal(true); // Make the dialog modal (blocks other windows)
dialog.setLocationRelativeTo(null); // Center the dialog
dialog.setVisible(true);
    }
    
}
