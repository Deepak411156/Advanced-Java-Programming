/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myjavabeans;

import javax.swing.JButton;
import java.io.Serializable;

/**
 *
 * @author Deepak Bhatta Kaji
 */

public class ButtonBean implements Serializable {
    private JButton button;

    public ButtonBean() {
        button = new JButton("Click Me!");
    }

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }
}

