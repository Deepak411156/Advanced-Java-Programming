/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.knightec.sendemail;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class SendEmail {

            // SMTP server information
        String host = "live.smtp.mailtrap.io";
        String port = "587";
        String ssl = "no";
        String tls = "yes";
        String username = "api";
        String password = "83087b49c56a4e02dad93f3850ec65cc";

        // Email details
        String toAddress = "dpkbhatta2051@gmail.com";
        String subject = "Test Email";
        String message = "This is a test email from Java!";

        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.starttls.enable", tls);  // Enable TLS
        properties.put("mail.smtp.ssl.enable", ssl);       // SSL not enabled

        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message mimeMessage = new MimeMessage(session);
            mimeMessage.setFrom(new InternetAddress(username));
            mimeMessage.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toAddress));
            mimeMessage.setSubject(subject);
            
            // Set the actual message
            mimeMessage.setText(message);

            // Send the email
            Transport.send(mimeMessage);

            System.out.println("Email sent successfully!");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    
}
