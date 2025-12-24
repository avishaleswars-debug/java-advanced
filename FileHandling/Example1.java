package FileHandling;

import java.io.*;

public class Example1 {
    public static void main(String[] args) throws Exception{
        InputStreamReader is=new InputStreamReader(System.in);
        int name=is.read();
        while(is.ready()){
            System.out.println((char)name);
            name=is.read();
        }
    }
}
