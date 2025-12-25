package SocketProgarmming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;
import java.util.*;
public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss=new ServerSocket(9999);
        Socket s=ss.accept();
        DataOutputStream ds=new DataOutputStream(s.getOutputStream());
                DataInputStream io=new DataInputStream(s.getInputStream());
                Scanner sc=new Scanner(System.in);
                new Thread(()->{try {while (true) {
                    
String li=io.readUTF();
System.out.println("Client  "+li);
               }
            }
               catch(Exception e){
                System.out.println(e);
               }
    }).start();
                while (true) {
  String line=sc.nextLine();
                    ds.writeUTF(line);
        
                }
    }
}
