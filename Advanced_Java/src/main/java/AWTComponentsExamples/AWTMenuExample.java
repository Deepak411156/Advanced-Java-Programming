/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AWTComponentsExamples;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class AWTMenuExample extends Frame {

    MenuBar menuBar;
    Menu menuFile, menuEdit, menuView, menuZoom, menuHelp;
    MenuItem itemOpen, itemSave, itemExit, itemZoomIn, itemZoomOut, itemStatusBar, itemWordWrap;
    PopupMenu popupMenu;

    public AWTMenuExample() {
        menuBar = new MenuBar();
        setMenuBar(menuBar);

        menuFile = new Menu("File");
        menuEdit = new Menu("Edit");
        menuView = new Menu("View");
        menuHelp = new Menu("Help");

        menuBar.add(menuFile);
        menuBar.add(menuEdit);
        menuBar.add(menuView);
        menuBar.add(menuHelp);

        itemOpen = new MenuItem("Open");
        itemSave = new MenuItem("Save");
        itemExit = new MenuItem("Exit");

        menuFile.add(itemOpen);
        menuFile.add(itemSave);
        menuFile.addSeparator();
        menuFile.add(itemExit);

        menuZoom = new Menu("Zoom");
        itemZoomIn = new MenuItem("Zoom in");
        itemZoomOut = new MenuItem("Zoom out");
        itemStatusBar = new MenuItem("Status bar");
        itemWordWrap = new MenuItem("Word wrap");

        menuView.add(menuZoom);
        menuView.add(itemStatusBar);
        menuView.add(itemWordWrap);
        menuZoom.add(itemZoomIn);
        menuZoom.add(itemZoomOut);

        popupMenu = new PopupMenu();

        MenuItem cut = new MenuItem("Cut");
        MenuItem copy = new MenuItem("Copy");
        MenuItem paste = new MenuItem("Paste");

        popupMenu.add(cut);
        popupMenu.add(copy);
        popupMenu.add(paste);

        add(popupMenu);

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }

            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });

        setTitle("AWT MEnu Example");
        setSize(300, 300);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new AWTMenuExample();
    }
}
