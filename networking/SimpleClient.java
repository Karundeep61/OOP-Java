package networking;

import java.io.*;
import java.net.*;

public class SimpleClient {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 12345;

        try (Socket socket = new Socket(host, port)) {
            System.out.println("Connected to the server!");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String message = "Hello, Server!";
            out.println(message);

            String serverResponce = in.readLine();
            System.out.println("Server says: " + serverResponce);
        } catch (IOException e) {
            System.out.println("Client reeor: " + e.getMessage());
        }
    }
}