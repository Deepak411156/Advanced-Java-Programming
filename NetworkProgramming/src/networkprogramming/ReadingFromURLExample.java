/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogramming;

import java.io.*;
import java.net.*;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class ReadingFromURLExample {

    public static void main(String[] args) {
        try {
            // Create a URL object for the target webpage
            URL url = new URL("https://www.example.com");

            // Open a BufferedReader to read text from the URL's input stream
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            // Read and display the content line by line
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the reader
            reader.close();
        } catch (IOException ex) {
            System.out.println("ERROR: Something went wrong! " + ex);
        }
    }
}
