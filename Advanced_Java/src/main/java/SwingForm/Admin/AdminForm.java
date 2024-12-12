/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SwingForm.Admin;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author deepakbhattakaji
 */
public class AdminForm extends  JFrame{
    
    public AdminForm()
    {
         JLabel welcome = new JLabel();
        
        welcome.setText("Hello Admin");
       
        setSize(500,500);
        setLocationRelativeTo(this);
        //setVisible(true);
    }
    
    public static void main(String[] args) {
       new AdminForm();
    }
    
}
