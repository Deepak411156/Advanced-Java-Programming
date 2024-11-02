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
public class GetRemoteIPAddress {

    public static void main(String[] args) {
        try {
            // Specify the domain name or the hostname of the remote server
            String host = "localhost";

            // Get the InetAddress object for the specified host
            InetAddress inetAddress = InetAddress.getByName(host);

            // Get the IP address as a string
            String ipAddress = inetAddress.getHostAddress();

            // Display the hostname and IP address
            System.out.println("Hostname: " + host);
            System.out.println("IP Address: " + ipAddress);
        } catch (UnknownHostException e) {
            System.out.println("Host not found: " + e.getMessage());
        }
    }
}
