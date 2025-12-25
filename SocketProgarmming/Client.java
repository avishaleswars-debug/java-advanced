package SocketProgarmming;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args)throws IOException {
        Socket s=new Socket("localhost",9999);
        DataInputStream io=new DataInputStream(s.getInputStream());
       String line= io.readUTF();
       System.out.println(line);
       s.close();
    }
}
