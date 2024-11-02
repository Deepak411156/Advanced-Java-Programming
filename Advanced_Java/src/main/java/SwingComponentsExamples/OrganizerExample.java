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
public class OrganizerExample extends JFrame {

    JDesktopPane desktopPane;

    public OrganizerExample() {
        // Set up frame
        setVisible(true);
        setTitle("Swing Component Organizer Example");
        setExtendedState(JFrame.MAXIMIZED_BOTH); //Full Screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create the main panel with a tabbed pane inside a split pane
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setDividerLocation(200);

        // Tabbed Pane on the left
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Tab 1", new JLabel("Content of Tab 1"));
        tabbedPane.addTab("Tab 2", new JLabel("Content of Tab 2"));
        tabbedPane.addTab("Tab 3", new JLabel("Content of Tab 3"));

        // Split pane: Left side with tabbed pane
        splitPane.setLeftComponent(tabbedPane);

        // Desktop Pane on the right (for internal frames)
        desktopPane = new JDesktopPane();
        splitPane.setRightComponent(desktopPane);

        // Add split pane to the frame
        add(splitPane, BorderLayout.CENTER);

        // Control Panel for cascading and tiling buttons
        JPanel controlPanel = new JPanel();
        JButton cascadeButton = new JButton("Cascade Windows");
        JButton tileButton = new JButton("Tile Windows");

        // Add buttons to the control panel
        controlPanel.add(cascadeButton);
        controlPanel.add(tileButton);

        // Add control panel to the bottom of the frame
        add(controlPanel, BorderLayout.SOUTH);

        // Add action listeners for the buttons
        cascadeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cascadeFrames();
            }
        });

        tileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tileFrames();
            }
        });

        // Add some internal frames to the desktop pane
        createInternalFrame("Internal Frame 1", 50, 50);
        createInternalFrame("Internal Frame 2", 100, 100);
        createInternalFrame("Internal Frame 3", 150, 150);
    }

    // Method to create internal frames
    private void createInternalFrame(String title, int x, int y) {
        JInternalFrame internalFrame = new JInternalFrame(title, true, true, true, true);
        internalFrame.setSize(200, 150);
        internalFrame.setLocation(x, y);
        internalFrame.setVisible(true);
        desktopPane.add(internalFrame);
    }

    // Method to cascade internal frames
    private void cascadeFrames() {
        JInternalFrame[] frames = desktopPane.getAllFrames();
        int offsetX = 30;
        int offsetY = 30;

        for (int i = 0; i < frames.length; i++) {
            frames[i].setLocation(i * offsetX, i * offsetY);
            frames[i].moveToFront();
        }
    }

    // Method to tile internal frames
    private void tileFrames() {
        JInternalFrame[] frames = desktopPane.getAllFrames();
        int numFrames = frames.length;

        if (numFrames == 0) {
            return;
        }

        int rows = (int) Math.ceil(Math.sqrt(numFrames));
        int cols = (int) Math.ceil((double) numFrames / rows);

        int frameWidth = desktopPane.getWidth() / cols;
        int frameHeight = desktopPane.getHeight() / rows;

        for (int i = 0; i < numFrames; i++) {
            frames[i].setBounds((i % cols) * frameWidth, (i / cols) * frameHeight, frameWidth, frameHeight);
        }
    }

    public static void main(String[] args) {

        OrganizerExample organizerExample = new OrganizerExample();

    }
}
