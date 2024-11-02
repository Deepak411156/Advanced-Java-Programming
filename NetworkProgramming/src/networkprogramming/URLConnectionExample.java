/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogramming;

import java.io.IOException;
import java.net.*;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class URLConnectionExample {

    public static void main(String[] args) {
        try {
            // Create a URL object
            URL url = new URL("https://www.google.com");

            // Open a connection to the URL
            URLConnection urlConnection = url.openConnection();

            // Display some information about the connection
            System.out.println("URL: " + url);
            System.out.println("Content Type: " + urlConnection.getContentType());
            System.out.println("Content Length: " + urlConnection.getContentLength());
            System.out.println("Last Modified: " + urlConnection.getLastModified());
        } catch (IOException ex) {
            System.out.println("ERROR: Something went wrong! " + ex);
        }
    }
}
