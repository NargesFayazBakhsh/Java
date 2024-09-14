package client;

import java.io.*;
import java.net.*;

public class Client {
    DatagramSocket clientSocket;

    static int sw;
    public String ipL;
    public int portL;

    public Client( int portNumber) throws SocketException {
        clientSocket = new DatagramSocket(portNumber);
    }

    public void run() throws IOException {
//             Narges FayazBakhsh
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            System.out.println("Please enter something");
            String line = consoleReader.readLine();
            line = line + " ";
            if(line.startsWith("user")){
                sw  = 1;
            }
            else if(line.startsWith("ip")){
                String[] tok= line.split(" ");
                ipL = tok[1];
            }
            else if(line.startsWith("port")){
                String[] tok= line.split(" ");
                portL = Integer.parseInt(tok[1]);
            }
            else if (line.startsWith("hear")){
                ClientHearing clientHearing = new ClientHearing(portL);
                clientHearing.run();
            }
            DatagramPacket packet = new DatagramPacket(line.getBytes(), line.getBytes().length,
                    InetAddress.getByName("localhost"), 20000);
            clientSocket.send(packet);

            if(line.startsWith("exit"))
                break;


            byte[] buffer = new byte[1024];
            DatagramPacket recivedPacket = new DatagramPacket(buffer,buffer.length);
            clientSocket.receive(recivedPacket);
            System.out.println(new String(recivedPacket.getData()));

            if (sw == 1 ) {
                String lineRec = new String(recivedPacket.getData());
                String[] tokensRec = lineRec.split(" ");

                String Ip = tokensRec[1];
                int Port = Integer.parseInt(tokensRec[2]);

                ClientTCP clientTCP = new ClientTCP(Ip ,Port);
                clientTCP.run();

            }
    }

        clientSocket.close();
    }

    public static void main(String[] args) {

        sw =0;
        Client client = null;
        try {
            client = new Client(40123);
            client.run();
        }
        catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
