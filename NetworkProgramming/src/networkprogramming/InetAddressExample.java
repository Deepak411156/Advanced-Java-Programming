/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogramming;

import java.net.*;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class InetAddressExample {

    public static void main(String[] args) {
        try {
            // Get the InetAddress object for a remote host (Google)
            InetAddress google = InetAddress.getByName("www.google.com");

            // Display information about the remote host
            System.out.println("Google Hostname: " + google.getHostName());
            System.out.println("Google IP Address: " + google.getHostAddress());

            // Get the InetAddress object for the local host
            InetAddress localHost = InetAddress.getLocalHost();

            // Display information about the local machine
            System.out.println("Local Hostname: " + localHost.getHostName());
            System.out.println("Local IP Address: " + localHost.getHostAddress());
        } catch (UnknownHostException ex) {
            System.out.println("ERROR: Something went wrong! " + ex);
        }
    }
}
