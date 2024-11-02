/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EventHandling;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class MouseAdapterExample extends JFrame {

    public MouseAdapterExample() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked using adapter!");
            }
        });

        setSize(300, 200);
        setTitle("Mouse Adapter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        MouseAdapterExample mouseAdapterExample = new MouseAdapterExample();
    }
}
