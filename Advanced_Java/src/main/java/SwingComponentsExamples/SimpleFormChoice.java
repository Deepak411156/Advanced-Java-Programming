/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SwingComponentsExamples;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class SimpleFormChoice extends JFrame {

    public SimpleFormChoice() {
        // Create frame with title
        setTitle("Choice Components Example");

        // Set the layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Padding

        // Check Box
        JCheckBox checkBox = new JCheckBox("Accept Terms and Conditions", true);
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(checkBox, gbc);

        // Radio Buttons and Group
        JRadioButton maleButton = new JRadioButton("Male", true);
        JRadioButton femaleButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(maleButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(femaleButton, gbc);

        // Combo Box
        String[] countryList = {"Select Country", "USA", "Canada", "Nepal", "India"};
        JComboBox<String> countryComboBox = new JComboBox<>(countryList);
        countryComboBox.setSelectedItem("Nepal");
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(countryComboBox, gbc);

        // Slider
        JSlider ageSlider = new JSlider(JSlider.HORIZONTAL, 18, 100, 25); // Min 18, Max 100, Initial 25
        ageSlider.setMajorTickSpacing(10);
        ageSlider.setPaintTicks(true);
        ageSlider.setPaintLabels(true);

        gbc.gridx = 0;
        gbc.gridy = 4;
        add(ageSlider, gbc);

        // Panel with Border
        JPanel infoPanel = new JPanel();
        infoPanel.setBackground(Color.WHITE);
        infoPanel.setPreferredSize(new Dimension(200, 100));
        infoPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Personal Info", TitledBorder.LEFT, TitledBorder.TOP));
        gbc.gridx = 0;
        gbc.gridy = 5;
        add(infoPanel, gbc);

        // Frame settings
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //pack(); // Adjust the window to fit components
        setSize(400, 400);
        setLocationRelativeTo(null); // Center the window on the screen
        setVisible(true);
    }

    public static void main(String[] args) {
        SimpleFormChoice simpleFormChoice = new SimpleFormChoice();
    }
}
