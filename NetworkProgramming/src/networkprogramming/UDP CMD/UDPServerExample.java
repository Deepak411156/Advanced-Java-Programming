import java.net.*;

public class UDPServerExample {

    public static void main(String[] args) {
        try {
            // Create a datagram socket to listen on port 8080
            DatagramSocket socket = new DatagramSocket(8080);
            System.out.println("UDP Server is running on port 8080");

            // Buffer to store incoming data
            byte[] buffer = new byte[1024];

            // Prepare a datagram packet to receive data
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

            // Wait for a packet from the client
            socket.receive(packet);
            System.out.println("Packet received from client");

            // Extract data from the received packet
            String clientMessage = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received from client: " + clientMessage);

            // Send a response to the client
            String responseMessage = "Hello, client! Message received.";
            byte[] responseData = responseMessage.getBytes();

            // Get client's address and port from the received packet
            InetAddress clientAddress = packet.getAddress();
            int clientPort = packet.getPort();

            // Send the response packet back to the client
            DatagramPacket responsePacket = new DatagramPacket(responseData, responseData.length, clientAddress, clientPort);
            socket.send(responsePacket);

            // Close the socket
            socket.close();
        } catch (Exception ex) {
            System.out.println("Server error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
