import java.io.*;
import java.net.*;
public class TCPServer {
  public static void main(String[] args) throws IOException {
    int portNumber = 5432;
    String serverIP = "localhost";
    try {
      ServerSocket serverSocket = new ServerSocket(portNumber);
      System.out.println("server started at:" + portNumber);
      Socket clientSocket = serverSocket.accept();
      System.out.println("got connection from" + clientSocket.getInetAddress() + "port number:" + clientSocket.getPort());

      PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
      BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
      String inputLine;
      while ((inputLine = in.readLine()) != null) {
        System.out.println("Got message:" + inputLine + "from the client");
        out.println(inputLine);
      }
    } catch (IOException e) {
      System.out.println("exception caught by server");
    }
  }
}