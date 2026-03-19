package SocketProgarmming;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MiniServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss=new ServerSocket(1111);
        Socket s=ss.accept();
 BufferedReader io = new BufferedReader(
                new InputStreamReader(s.getInputStream())
        );          String line;
          while((line=io.readLine())!=null&&!line.isEmpty()){
              System.out.println(line);
          }
          String body = "<html><body><h1>Hello from my Java Server! </h1></body></html>";
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
          ss.close();
    }
}
