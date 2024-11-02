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
public class MouseListenerExample extends JFrame implements MouseListener {

    public MouseListenerExample() {
        addMouseListener(this);
        setSize(300, 200);
        setTitle("Mouse Events");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked!");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered!");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited!");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed!");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released!");
    }

    public static void main(String[] args) {
        MouseListenerExample mouseListenerExample = new MouseListenerExample();
    }
}
