package client;

import java.io.*;
import java.net.Socket;

public class ClientThread implements Runnable {

    Socket connectionSocket;
    BufferedReader reader;
    BufferedWriter writer;


    public ClientThread(Socket connectionSocket) throws IOException {
        this.connectionSocket = connectionSocket;
        reader = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
        writer = new BufferedWriter(new OutputStreamWriter(connectionSocket.getOutputStream()));
//                       Narges FayazBakhsh 9815091026
    }

    @Override
    public void run() {
        System.out.println("Local IP : " + connectionSocket.getLocalAddress().getHostAddress());
        System.out.println("Local Port : " + connectionSocket.getLocalPort());
        System.out.println("Remote IP : " + connectionSocket.getInetAddress().getHostAddress());
        System.out.println("Remote Port : " + connectionSocket.getPort());

        System.out.println("\n"+"start chat:");

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));//////

        while (true){
            try {
                String line = reader.readLine();
                System.out.println("server received : "+ line);
                if(line.startsWith("exit")){
                    break;
                }

                System.out.println("enter your answer:");
                line = consoleReader.readLine();
                writer.write(line + "\n");
                writer.flush();
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
            connectionSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
