/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SwingComponentsExamples;

import javax.swing.*;

/**
 *
 * @author Deepak Bhatta Kaji
 */

public class OptionDialogExample {
    public static void main(String[] args) {
        // Define the custom options
        String[] options = {"Option 1", "Option 2", "Option 3"};
        
        // Display the option dialog
        int choice = JOptionPane.showOptionDialog(null, 
                "Please select an option:", // Message to display
                "Option Dialog Example",    // Title of the dialog
                JOptionPane.DEFAULT_OPTION, // Dialog type
                JOptionPane.INFORMATION_MESSAGE, // Message type
                null,                       // Icon (null for no icon)
                options,                    // Options array
                options[0]);                // Default option (pre-selected)

        // Handle the user's choice
        if (choice >= 0 && choice < options.length) {
            JOptionPane.showMessageDialog(null, 
                    "You selected: " + options[choice]);
        } else {
            JOptionPane.showMessageDialog(null, 
                    "No option selected.");
        }
    }
}
