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

public class ProgressBarExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JProgressBar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        
        // Create a progress bar
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setValue(50);  // Set current progress (e.g., 50%)
        progressBar.setStringPainted(true);  // Show percentage
        
        frame.add(progressBar, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
