import java.net.*;

public class UDPClientExample {

    public static void main(String[] args) {
        try {
            // Create a datagram socket to send/receive data
            DatagramSocket socket = new DatagramSocket();

            // Prepare the data to be sent (in bytes)
            String message = "Hello, server!";
            byte[] buffer = message.getBytes();

            // Create a datagram packet to send data to the server (localhost, port 8080)
            InetAddress serverAddress = InetAddress.getByName("localhost");
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, serverAddress, 8080);

            // Send the packet to the server
            socket.send(packet);
            System.out.println("Message sent to server");

            // Buffer to store incoming data (response from the server)
            byte[] responseBuffer = new byte[1024];

            // Prepare a datagram packet to receive the response
            DatagramPacket responsePacket = new DatagramPacket(responseBuffer, responseBuffer.length);

            // Receive the server's response
            socket.receive(responsePacket);

            // Extract and display the server's response
            String serverMessage = new String(responsePacket.getData(), 0, responsePacket.getLength());
            System.out.println("Received from server: " + serverMessage);

            // Close the socket
            socket.close();
        } catch (Exception ex) {
            System.out.println("Client error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
