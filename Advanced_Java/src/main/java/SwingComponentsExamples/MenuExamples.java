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
public class MenuExamples extends JFrame {

    public MenuExamples() {
        // Set up frame
        setTitle("Menu Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // Menu Bar
        JMenuBar menuBar = new JMenuBar();

        // File Menu
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic('F'); // Alt+F for File menu

        JMenuItem openItem = new JMenuItem("Open", new ImageIcon("open_icon.png"));
        openItem.setMnemonic('O'); // Alt+O for Open
        openItem.setAccelerator(KeyStroke.getKeyStroke('O', Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));

        JMenuItem saveItem = new JMenuItem("Save", new ImageIcon("save_icon.png"));
        saveItem.setAccelerator(KeyStroke.getKeyStroke('S', Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setAccelerator(KeyStroke.getKeyStroke('E', Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));

        // Add items to the file menu
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator(); // Add a separator line
        fileMenu.add(exitItem);

        // Edit Menu with Check Box and Radio Button
        JMenu editMenu = new JMenu("Edit");
        JCheckBoxMenuItem showStatusBar = new JCheckBoxMenuItem("Show Status Bar", true);
        editMenu.add(showStatusBar);

        // Radio Buttons in a Button Group
        JRadioButtonMenuItem option1 = new JRadioButtonMenuItem("Option 1");
        JRadioButtonMenuItem option2 = new JRadioButtonMenuItem("Option 2");
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        editMenu.add(option1);
        editMenu.add(option2);

        // Add menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        // Set the menu bar to the frame
        setJMenuBar(menuBar);

        // Tool Bar
        JToolBar toolBar = new JToolBar();
//        JButton newButton = new JButton(new ImageIcon("H:\\One Drive KMC\\OneDrive - Kailali Multiple Campus\\Documents\\NetBeansProjects\\Advanced_Java\\src\\main\\java\\SwingComponentsExamples\\images\\new-48.png"));
//        newButton.setToolTipText("Create a new file");
//        JButton openButton = new JButton(new ImageIcon("H:\\One Drive KMC\\OneDrive - Kailali Multiple Campus\\Documents\\NetBeansProjects\\Advanced_Java\\src\\main\\java\\SwingComponentsExamples\\images\\open-48.png"));
//        openButton.setToolTipText("Open a file");

        ImageIcon new48 = new ImageIcon("H:\\One Drive KMC\\OneDrive - Kailali Multiple Campus\\Documents\\NetBeansProjects\\Advanced_Java\\src\\main\\java\\SwingComponentsExamples\\images\\new-48.png");
        Image new_img = new48.getImage();

        Image scaledImg_new16 = new_img.getScaledInstance(16, 16, Image.SCALE_SMOOTH);
        ImageIcon scaled_new16 = new ImageIcon(scaledImg_new16);
        JButton btn_new16 = new JButton(scaled_new16);
        btn_new16.setToolTipText("Create a new file");
        toolBar.add(btn_new16);

        ImageIcon open48 = new ImageIcon("H:\\One Drive KMC\\OneDrive - Kailali Multiple Campus\\Documents\\NetBeansProjects\\Advanced_Java\\src\\main\\java\\SwingComponentsExamples\\images\\open-48.png");
        Image open_img = open48.getImage();

        Image scaledImg_open16 = open_img.getScaledInstance(16, 16, Image.SCALE_SMOOTH);
        ImageIcon scaled_open16 = new ImageIcon(scaledImg_open16);
        JButton btn_open16 = new JButton(scaled_open16);
        btn_open16.setToolTipText("Open a file");
        toolBar.add(btn_open16);

        // Add toolbar to the frame
        add(toolBar, BorderLayout.NORTH);

        // Pop-up Menu
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");
        popupMenu.add(cutItem);
        popupMenu.add(copyItem);
        popupMenu.add(pasteItem);

        // Text Field with Pop-up Menu
        JTextField textField = new JTextField(20);
        textField.setComponentPopupMenu(popupMenu);
        add(textField, BorderLayout.CENTER);

        // Button to exit
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        MenuExamples menuExamples = new MenuExamples();
    }
}
