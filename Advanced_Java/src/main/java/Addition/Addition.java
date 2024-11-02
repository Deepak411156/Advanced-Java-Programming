/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Addition;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BoxLayout;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class Addition extends Frame {

    Frame frame;
    Panel panel;
    Button btn1;
    Label l1;
    TextField txtnum1;

    public Addition() {
        frame = new Frame();
        panel = new Panel();
        txtnum1 = new TextField(20);
        l1 = new Label();
        btn1 = new Button("Click me");

        frame.add(panel);
        
        panel.add(btn1);
        btn1.setBounds(50, 50, 80, 30);
        
        panel.add(l1);
        l1.setBounds(70, 170, 250, 20);
        
        panel.add(txtnum1);
        txtnum1.setBounds(70, 150, 250, 20);
        
        txtnum1.setEchoChar('*');


        frame.setTitle("Calculator");
       
        frame.setSize(400, 400);
      
        panel.setLayout(null);
        frame.setVisible(true);
      
        btn1.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                 l1.setText("Hello");
            }

        });
     
        frame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    

    }

    public static void main(String[] args) {
        Addition addition = new Addition();
    }

}
