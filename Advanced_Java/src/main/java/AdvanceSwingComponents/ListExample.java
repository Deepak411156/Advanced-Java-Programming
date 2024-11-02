/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdvanceSwingComponents;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Deepak Bhatta Kaji
 */

public class ListExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JList Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // List data
        String[] fruits = {"Apple", "Orange", "Banana", "Grapes"};
        
        // Create the list
        JList<String> list = new JList<>(fruits);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Single selection
        
        // Add the list to a scroll pane
        JScrollPane scrollPane = new JScrollPane(list);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
