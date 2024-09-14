package server;

public class Users {


    private String name;
    private String  Port;
    private String Ip;


    void Users(String name){
        this.name = name;
        Port = " ";
        Ip = " ";
//                        Narges FayazBakhsh 9815091026
    }

    public void ip (String ip){
        Ip = ip;
    }
    public void port(String port){
        Port = port;
    }

    public String get() {
        return name;
    }

    public String information(){
        String answer = " "+ Ip + " " + Port + " ";
        return answer;
    }

}
