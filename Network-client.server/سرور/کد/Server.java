package server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;


public class Server {

    static int count;
    static Users [] users = new Users[10];
    DatagramSocket serverSocket ;

    public Server() throws SocketException{
        serverSocket = new DatagramSocket(20000);
    }

    public void run() throws IOException {
        while (true) {
            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            System.out.println("Server start listening");
            serverSocket.receive(packet);
//                 Narges FayazBakhsh 9815091026
            System.out.println("Packet Data: " + new String(packet.getData()));
            System.out.println("Packet Lenght: " + packet.getLength());
            System.out.println("Packet Source ID:" + packet.getAddress().getHostAddress());
            System.out.println("Packet Source Port: " + packet.getPort());

            String line = new String(packet.getData());

            String response = null;
            if (line.startsWith("register")) {
                String[] tokens = line.split(" ");
                if (add(tokens[1]) == 0) {
                    response = "welcome " + tokens[1] + ". you are registered successfully."+
                            " please add your ip and port.";
                } else
                    response = "this user exit! please try again";
            }
            else if (line.startsWith("ip")) {
                String[] tokens = line.split(" ");
                addIp(tokens[1]);
                response = "your ip successfully add.";
            } else if (line.startsWith("port")) {
                String[] tokens = line.split(" ");
                addport(tokens[1]);
                response = "your port successfully add.";
            } else if (line.startsWith("user")) {
                int k;
                for (k = 0; k <= count; k++) {

                    String[] tokens = line.split(" ");
                    int w = search(tokens[1]);
                    if(w != -1) {
                        response = tokens[1] + users[w].information();
                    }
                    else
                        response = "this user dont exist";
                }
            }
            else
                response = "Your keyword is not recognize!";


            DatagramPacket sendPacket = new DatagramPacket(response.getBytes(), response.getBytes().length,
                            packet.getAddress(), packet.getPort());
            serverSocket.send(sendPacket);

            System.out.println();
        }
    }

    public int search(String name) {
        int sw = -1;
        for (int i = 0; i <= count; i++) {
            if (users[i].get().equals(name))
                sw = i;
        }
     return sw;
    }

        public int add(String name){
        if(search(name) == -1 ) {
            count++;
            users[count] = new Users();
            users[count].Users(name);

            return 0;
        }
        else
            return 1;
    }

    public void addIp(String ip) {
        users[count].ip(ip);
    }

    public void addport(String port) {
        users[count].port(port);
    }


    public static void main(String[] args) {
        count = -1;
        try{
            Server server = new Server();
            server.run();
        } catch (SocketException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();

        }

    }
}
