/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SwingForm;

import javax.swing.*;

/**
 *
 * @author deepakbhattakaji
 */
public class CheckLoginStatus extends JFrame{
    
    public boolean getLoginDetails(String email, String password)
    {
        boolean status = false;
        
        String txtEmail = "admin";
        String txtPassword = "admin";        
        if(email.equals(txtEmail)&&password.equals(txtPassword))
        {
            status = true;
        }
        
        else
        {
            status = false;
        }
        
        return  status;
        
    }
    
}
