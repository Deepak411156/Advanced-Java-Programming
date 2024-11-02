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

public class TableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Table column names
        String[] columnNames = {"ID", "Name", "Age"};
        
        // Table data
        Object[][] data = {
            {1, "Deepak", 30},
            {2, "Harish", 23},
            {3, "Dinesh", 40}
        };
        
        // Create the table
        JTable table = new JTable(data, columnNames);
        
        // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
