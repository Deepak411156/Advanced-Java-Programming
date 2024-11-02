/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AWTComponentsExamples;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class AWTImageBrowse extends Frame {

    Label imageLabel;
    Button browseButton;
    Canvas canvas;
    Image selectedImage;

    public AWTImageBrowse() {
        // Set layout for the frame
        setLayout(new FlowLayout());

        // Label for Image
        imageLabel = new Label("Selected Image:");
        add(imageLabel);

        // Canvas to display the image
        canvas = new Canvas() {
            public void paint(Graphics g) {
                if (selectedImage != null) {
                    g.drawImage(selectedImage, 0, 0, 200, 200, this); // Draw the selected image
                } else {
                    g.drawRect(0, 0, 200, 200); // Placeholder rectangle
                    g.drawString("No Image", 70, 100);
                }
            }
        };
        canvas.setSize(200, 200);
        add(canvas);

        // Button to Browse image
        browseButton = new Button("Browse Image");
        add(browseButton);

        // Action listener for Browse button
        browseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FileDialog fileDialog = new FileDialog(AWTImageBrowse.this, "Select an Image", FileDialog.LOAD);
                fileDialog.setVisible(true);

                // Get the selected file's path
                String directory = fileDialog.getDirectory();
                String fileName = fileDialog.getFile();

                if (directory != null && fileName != null) {
                    String filePath = directory + fileName;
                    selectedImage = Toolkit.getDefaultToolkit().getImage(filePath);
                    repaint(); // Repaint the canvas to display the new image
                }
            }
        });

        // Set frame properties
        setTitle("AWT Image Browser");
        setSize(400, 300);
        setVisible(true);

        // Close the frame on window close
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new AWTImageBrowse();
    }
}
