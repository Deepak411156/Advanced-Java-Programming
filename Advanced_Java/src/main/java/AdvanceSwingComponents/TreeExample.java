/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdvanceSwingComponents;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

/**
 *
 * @author Deepak Bhatta Kaji
 */

public class TreeExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTree Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // Create the root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        
        // Create child nodes
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        
        // Add child nodes to root
        root.add(child1);
        root.add(child2);
        
        // Create the tree by passing in the root node
        JTree tree = new JTree(root);

        // Add the tree to a scroll pane
        JScrollPane scrollPane = new JScrollPane(tree);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
