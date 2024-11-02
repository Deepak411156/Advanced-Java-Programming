/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogramming;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Deepak Bhatta Kaji
 */
class SocketServer implements Runnable {

    private ServerSocket serverSocket;

    @Override
    public void run() {
        try {
            serverSocket = new ServerSocket(8080);
            while (!Thread.currentThread().isInterrupted()) {
                Socket clientSocket = serverSocket.accept();  // Can be interrupted
                // Handle client
            }
        } catch (IOException ex) {
            System.out.println("ERROR: Something went wrong! " + ex);
        }
    }

    public void stop() {
        Thread.currentThread().interrupt();
    }
}
