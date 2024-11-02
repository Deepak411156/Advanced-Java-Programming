import java.io.*;
import java.net.*;
public class TCPClient {
  public static void main(String[] args) {
    int portNumber = 5432;
    String hostname = "localhost";
    try {
      Socket echoSocket = new Socket(hostname, portNumber);
      System.out.println("client 1: connected to: " + echoSocket.toString());
      PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
      System.out.println("client 1: Do you want to send to the echo server");
      BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
      BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
      String userInput;
      while ((userInput = stdIn.readLine()) != null) {
        out.println(userInput);
        System.out.println("do you want to send anything else:");
        System.out.println("echo:" + in.readLine());
      }
    } catch (IOException e) {
      System.out.println("exception caught by client");

    }
  }
}