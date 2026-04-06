package SocketProgarmming;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;

public class MiniServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss=new ServerSocket(1111);
        while (true) {
    Socket s = ss.accept();
    new Thread(() -> {
        try {
            handleclient(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }).start();
}
    }
       public static void handleclient(Socket s)throws Exception{
 BufferedReader io = new BufferedReader(
                new InputStreamReader(s.getInputStream())
        );          String line;
          while((line=io.readLine())!=null&&!line.isEmpty()){
              System.out.println(line);
          }
       //   System.out.println(new java.io.File("").getAbsolutePath());
          String body = readFile("SocketProgarmming/index.html");
          PrintWriter out = new PrintWriter(s.getOutputStream());

        // Status line
        out.println("HTTP/1.1 200 OK");

        // Headers
        out.println("Content-Type: text/html");
        out.println("Content-Length: " + body.length());

        // Blank line — separates headers from body (MANDATORY)
        out.println("");

        // Body
        out.println(body);
        out.flush();
          io.close();
          s.close();
    
}
     private static String readFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
}
