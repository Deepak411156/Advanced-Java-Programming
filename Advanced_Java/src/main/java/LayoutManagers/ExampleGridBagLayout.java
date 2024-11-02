/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LayoutManagers;

import java.awt.*;
import java.awt.Font.*;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class ExampleGridBagLayout {

    Frame frame;
    GridBagLayout gridbag;
    GridBagConstraints gbc;

    Button b1, b2, b3, b4, b5;

    public ExampleGridBagLayout() {
        frame = new Frame();
        gridbag = new GridBagLayout();
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
        b4 = new Button("Button 4");
        b5 = new Button("Button 5");

        frame.setFont(new Font("Helvetica", Font.PLAIN, 14));
        frame.setBackground(Color.cyan);
        frame.setLayout(gridbag);

        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;

        gbc.gridx = 0;
        gbc.gridy = 0;
//        frame.add(b1, gbc);
        gridbag.setConstraints(b1, gbc);
        frame.add(b1);

        gbc.gridx = 1;
        gbc.gridy = 0;
//        frame.add(b2, gbc);
        gridbag.setConstraints(b2, gbc);
        frame.add(b2);

        gbc.gridx = 0;
        gbc.gridy = 1;
//        frame.add(b3, gbc);
        gridbag.setConstraints(b3, gbc);
        frame.add(b3);

        gbc.gridx = 1;
        gbc.gridy = 1;
//        frame.add(b4, gbc);
        gridbag.setConstraints(b4, gbc);
        frame.add(b4);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
//        frame.add(b5, gbc);
        gridbag.setConstraints(b5, gbc);
        frame.add(b5);

        frame.setTitle("GridBag Layout");
        frame.setSize(300, 200);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        ExampleGridBagLayout gbl = new ExampleGridBagLayout();
    }
}
