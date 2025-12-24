package FileHandling;

import java.io.*;
public class Example2 {
public static void main(String[] args ) throws Exception{
    File fr=new File("Hello1.txt");
    FileOutputStream fo=new FileOutputStream(fr);
    DataOutputStream d=new DataOutputStream(fo);
    d.writeUTF("hi hello");
    String[] str={"hello","hi","Morinig"};
    for (String s : str) {
        d.writeUTF(s);
    }
     FileInputStream f=new FileInputStream(fr);
    DataInputStream dw=new DataInputStream(f);
    while (dw.available()>0) {
            String line=dw.readUTF();
    System.out.println(line);
    }

    dw.close();
    d.close();
}
}
