/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogramming;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class EmailSender {

    public static void main(String[] args) {
        // SMTP server information
        String host = "sandbox.smtp.mailtrap.io";
        String port = "2525";
        String ssl = "no";
        String tls = "yes";
        String username = "4d4043f4b4e9a2";
        String password = "b1d327121890c8";

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
        } catch (MessagingException ex) {
            System.out.println("ERROR: Something went wrong! " + ex);
        }
    }
}
