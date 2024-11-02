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
public class MultiThreadedTCPServer {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Server is listening on port 8080");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected");

                // Create a new thread for each client
                new ClientHandler(clientSocket).start();
            }
        } catch (IOException ex) {
            System.out.println("ERROR: Something went wrong! " + ex);
        }
    }
}

class ClientHandler extends Thread {

    private Socket clientSocket;

    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Handle client communication
            String message;
            while ((message = in.readLine()) != null) {
                System.out.println("Received: " + message);
                out.println("Echo: " + message);
            }

            clientSocket.close();
        } catch (IOException ex) {
            System.out.println("ERROR: Something went wrong! " + ex);
        }
    }
}
