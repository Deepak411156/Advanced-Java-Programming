
import java.io.*;
import java.net.*;


public class TCPServerExample {

    public static void main(String[] args) {
        try {
            // Create a server socket that listens on port 8080
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Server is listening on port 8080");

            // Wait for a client connection
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            // Create input and output streams to communicate with the client
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            // Read the client's message
            String clientMessage = reader.readLine();
            System.out.println("Received from client: " + clientMessage);

            // Send a response back to the client
            writer.println("Hello, client! Message received.");

            // Close the connection
            socket.close();
            serverSocket.close();
        } catch (IOException ex) {
            System.out.println("Server error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
