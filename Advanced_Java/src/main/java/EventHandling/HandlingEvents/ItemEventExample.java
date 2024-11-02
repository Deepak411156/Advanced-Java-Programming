/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EventHandling.HandlingEvents;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class ItemEventExample extends JFrame implements ItemListener {

    JCheckBox checkBox;

    public ItemEventExample() {
        checkBox = new JCheckBox("Check Me");
        checkBox.addItemListener(this);  // Register ItemListener
        add(checkBox);
        setTitle("Item Event");
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            System.out.println("Checkbox selected");
        } else {
            System.out.println("Checkbox deselected");
        }
    }

    public static void main(String[] args) {
        ItemEventExample itemEventExample = new ItemEventExample();
    }
}
