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
public class TCPClientExample {

    public static void main(String[] args) {
        try {
            // Connect to the server running on localhost and port 8080
            Socket socket = new Socket("localhost", 8080);
            System.out.println("Connected to the server");

            // Create output stream to send data to the server
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            // Send a message to the server
            writer.println("Hello, server!");

            // Create input stream to receive the server's response
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            // Read the server's response
            String serverMessage = reader.readLine();
            System.out.println("Received from server: " + serverMessage);

            // Close the connection
            socket.close();
        } catch (IOException ex) {
            System.out.println("Client error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
