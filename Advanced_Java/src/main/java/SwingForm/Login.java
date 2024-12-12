/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SwingForm;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import SwingForm.Login;

import SwingForm.Admin.AdminForm;

/**
 *
 * @author deepakbhattakaji
 */
public class Login extends JFrame {
    JPanel pnlImage, pnlLoginForm;
    JLabel lblImage, lblEmail, lblPassword;
    JTextField txtEmail;
    JPasswordField txtPassword;
    JButton btnLogin, btnClear;
    
    
    Login()
    {
        pnlImage = new JPanel();
        pnlLoginForm = new JPanel();
        
        pnlLoginForm.setLayout(null);
        
        lblEmail = new JLabel("Email:");
        lblEmail.setBounds(50, 20, 100, 30);
        pnlLoginForm.add(lblEmail);
        
        txtEmail = new JTextField();
        txtEmail.setBounds(150, 20, 250, 30);
        pnlLoginForm.add(txtEmail);
        
        lblPassword = new JLabel("Password:");
        lblPassword.setBounds(50, 60, 100, 30);
        pnlLoginForm.add(lblPassword);
        
        txtPassword = new JPasswordField();
        txtPassword.setBounds(150, 60, 250, 30);
        pnlLoginForm.add(txtPassword);
        
        btnLogin = new JButton("Login");
        btnLogin.setBounds(145, 100, 100, 30);
        pnlLoginForm.add(btnLogin);
        
        btnClear = new JButton("Clear");
        btnClear.setBounds(300, 100, 100, 30);
        pnlLoginForm.add(btnClear);
        
        
        lblImage = new JLabel();
        ImageIcon imageicon = new ImageIcon("/Users/deepakbhattakaji/Documents/GitHub/Advanced-Java-Programming/Advanced_Java/src/main/java/images/icons8-test-account-96.png");
        lblImage.setIcon(imageicon);
        
        pnlImage.add(lblImage);
        
        
     
        
        
        setLayout(new BorderLayout());
        
        add(pnlImage,BorderLayout.WEST);
        add(pnlLoginForm,BorderLayout.CENTER);
        
        setTitle("KMC - Student Login");
        setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
        setSize(600,200);
        setLocationRelativeTo(null);

           btnLogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String getEmail = txtEmail.getText();
                String getPassword = new String(txtPassword.getPassword());
                
                CheckLoginStatus check = new CheckLoginStatus();
                
              boolean status =  check.getLoginDetails(getEmail, getPassword);
               
              String message = "";
                if(status==true)
                {
                    message = "Login Success....";
                    JOptionPane.showMessageDialog(Login.this, message, "Sucess", JOptionPane.INFORMATION_MESSAGE);
                    AdminForm admin = new AdminForm();
                   
                    Login login = new Login();
                    login.setVisible(false);
                    login.dispose();
                    
                     admin.setVisible(true);
                }
                else
                {
                    message ="Login Failed...";
                    JOptionPane.showMessageDialog(Login.this, message, "Error", JOptionPane.ERROR_MESSAGE);
                }   
            }
            
        });
            setVisible(true);
    }
    
    public static void main(String[] args) {
        new Login();
    }
    
}
