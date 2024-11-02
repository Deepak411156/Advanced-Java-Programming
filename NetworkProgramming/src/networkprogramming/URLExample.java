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
public class URLExample {

    public static void main(String args[]) {
        URL url;
        try {
            url = new URL("http://localhost:8080/project");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Port: " + url.getPort());
            System.out.println("Host: " + url.getHost());
            System.out.println("File: " + url.getFile());

        } catch (MalformedURLException ex) {
            System.out.println("ERROR: Something went wrong! " + ex);
        }
    }
}
