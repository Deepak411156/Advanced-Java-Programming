/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdvanceSwingComponents;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author Deepak Bhatta Kaji
 */

public class RunningProgressBarExample {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("JProgressBar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(new BorderLayout());

        // Create a progress bar
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);  // Show the percentage
        
        // Add progress bar to the frame
        frame.add(progressBar, BorderLayout.CENTER);
        
        // Create a panel for the button
        JPanel panel = new JPanel();
        JButton startButton = new JButton("Start Progress");
        panel.add(startButton);
        
        // Add panel to the frame
        frame.add(panel, BorderLayout.SOUTH);
        
        // Button click starts the progress bar
        startButton.addActionListener(e -> {
            // Disable button while task runs
            startButton.setEnabled(false);
            
            // Create a SwingWorker to handle the progress in the background
            SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
                @Override
                protected Void doInBackground() throws InterruptedException {
                    // Simulate task progress from 0 to 100%
                    for (int i = 0; i <= 100; i++) {
                        Thread.sleep(50);  // Simulate work with delay
                        progressBar.setValue(i);  // Update progress bar
                    }
                    return null;
                }

                @Override
                protected void done() {
                    // When done, show a success message and re-enable the button
                    try {
                        get();
                        JOptionPane.showMessageDialog(frame, "Task Completed Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } catch (InterruptedException | ExecutionException ex) {
                        ex.printStackTrace();
                    }
                    startButton.setEnabled(true);  // Re-enable button
                }
            };
            
            // Start the background task
            worker.execute();
        });

        // Display the frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
