package client;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientHearing {

    ServerSocket serverSocket;
    ExecutorService pool;

    public ClientHearing(int port) throws IOException {
    //                       Narges FayazBakhsh 9815091026
        serverSocket = new ServerSocket(port);
        System.out.println("Server Socket is initialized");

        pool = Executors.newFixedThreadPool(5);
    }
    public void run() throws IOException {
        while (true) {
            System.out.println("Server socket start listening");
            Socket connectionSocket = serverSocket.accept();
            System.out.println("Server Socket find a new connection");

            ClientThread clientThread = new ClientThread(connectionSocket);
            pool.execute(clientThread);
        }
    }

}
