/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Addition;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Deepak Bhatta
 */
public class LoginForm extends Frame {
    
    Button Login, Clear;
    TextField UserName,Password;
    Dialog showMsg;
    public LoginForm()
    {
        Login = new Button("Login");
        Clear = new Button("Clear");
        UserName = new TextField();
        Password = new TextField();
        
        
        UserName.setBounds(40, 30, 250, 30);
        Password.setBounds(40, 60, 250, 30);
        Login.setBounds(40, 90, 120, 30);
        Clear.setBounds(180, 90, 120, 30);
        
        add(UserName);
        add(Password);
        add(Login);
        add(Clear);
        
        setLayout(null);
        
        setTitle("कैलाली बहुमुखी क्याम्पस  - Login");
        setSize(500, 500);
        setVisible(true);
        
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            
        }
        
        
        );
        
        Clear.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                clearData();
            }
            
            
        });
        
        
        Login.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                loginData();
            }
            
            
        });
        
    }
    
    
    public void clearData()
        {
            UserName.setText("");
            Password.setText("");
            
        }
    
    public void loginData()
    {
        showMsg = new Dialog(this, "Login - Success", true);
        showMsg.setSize(200,300);
        showMsg.setLayout(null);
        
        String txtUserName = UserName.getText();
        String txtPassword = Password.getText();
        
        Label lblUN = new Label(txtUserName);
        Label lblPass = new Label(txtPassword);
        
        Button btnClose = new Button("Close");
        
        lblUN.setBounds(50, 40, 150, 30);
        lblPass.setBounds(50, 80, 150, 30);
        btnClose.setBounds(10, 20, 30, 30);
    
       
        showMsg.add(lblUN);
        showMsg.add(lblPass);
        showMsg.add(btnClose);
        
        
       

    
    btnClose.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            showMsg.setVisible(false); // Close the dialog
            showMsg.dispose();        // Free dialog resources
        }
    });

    
    showMsg.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            showMsg.setVisible(false); 
            showMsg.dispose();        
        }
    });
    
    showMsg.setVisible(true);
                
    }
    
    public static void main(String args[])
    {
        LoginForm form = new LoginForm();
    }
    
}
