/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Addition;

import java.awt.*;

/**
 *
 * @author Deepak Bhatta
 */
public class LoginForm extends Frame {
    Frame frame;
    Panel panel;
    Button btn1;
    TextField UserName,Password;
    
    public LoginForm()
    {
        frame = new Frame();
        panel = new Panel();
        btn1 = new Button("Login");
        UserName = new TextField();
        Password = new TextField();
        
        frame.setTitle("KMC - Login");
        frame.setVisible(true);
        frame.add(panel);
        frame.setLayout(null);
        
    }
    
    public static void main(String args[])
    {
        LoginForm form = new LoginForm();
    }
    
}
