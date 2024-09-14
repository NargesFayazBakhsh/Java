package client;

import java.io.*;
import java.net.Socket;

public class ClientTCP {

    Socket socket;
    BufferedReader reader;
    BufferedWriter writer;

    public ClientTCP(String ip , int port) {
        try {
            socket = new Socket("localhost", port);
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {
//                   Narges FayazBakhsh 9815091026
        System.out.println("Local IP : " + socket.getLocalAddress().getHostAddress());
        System.out.println("Local Port : " + socket.getLocalPort());
        System.out.println("Remote IP : " + socket.getInetAddress().getHostAddress());
        System.out.println("Remote Port : " + socket.getPort());

        System.out.println("\n"+"start chat:");

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                System.out.println("Please enter something: ");
                String line = consoleReader.readLine();
                writer.write(line + "\n");
                writer.flush();
                if (line.startsWith("exit")) {
                    break;
                }
                line = reader.readLine();
                System.out.println("Server Response : " + line);
                if(line.startsWith("exit")){
                    break;
                }

            } catch (IOException e) {
                e.printStackTrace();
                break;
            }

        }
        try {
            System.out.println("exit chat!");
            reader.close();
            writer.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
