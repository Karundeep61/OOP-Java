package networking;

import java.io.*;
import java.net.*;

public class SimpleServer {
    public static void main(String[] args) {
        int port = 12345;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is running and wating for a clent....");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected!");

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            String clientMessage = in.readLine();
            System.out.println("Client says: " + clientMessage);

            out.println("Hello, client. Message recived: " + clientMessage);

            clientSocket.close();
            System.out.println("Client disconnected!");
        } catch (IOException e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}