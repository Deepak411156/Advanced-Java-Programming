/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SwingComponentsExamples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author deepakbhattakaji
 */
public class MenuIconsExample {
    

    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Menu with Icons Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create a JMenu
        JMenu fileMenu = new JMenu("File");
        // Create menu items with icons
        JMenuItem newItem = new JMenuItem("New", new ImageIcon("/Users/deepakbhattakaji/Documents/GitHub/Advanced-Java-Programming/Advanced_Java/src/main/java/SwingComponentsExamples/icons/346.png"));
        JMenuItem openItem = new JMenuItem("Open", new ImageIcon("/Users/deepakbhattakaji/Documents/GitHub/Advanced-Java-Programming/Advanced_Java/src/main/java/SwingComponentsExamples/icons/347.png"));
        JMenuItem exitItem = new JMenuItem("Exit", new ImageIcon("/Users/deepakbhattakaji/Documents/GitHub/Advanced-Java-Programming/Advanced_Java/src/main/java/SwingComponentsExamples/icons/349.png"));

        // Add action listeners for menu items
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Exit the application
            }
        });

        // Add menu items to the menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator(); // Add a separator
        fileMenu.add(exitItem);

        // Add the menu to the menu bar
        menuBar.add(fileMenu);

        // Set the menu bar to the frame
        frame.setJMenuBar(menuBar);

        frame.setLocationRelativeTo(null);
        // Make the frame visible
        frame.setVisible(true);
    }
}