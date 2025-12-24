package FileHandling;

import java.io.*;

public class Example4 {
    public static void main(String[] args) throws Exception {
        FileReader fr=new FileReader("Hello.txt");
        BufferedReader br=new BufferedReader(fr);
        String line;
        while((line=br.readLine())!=null){
System.out.println(line);
        }
        br.close();
    }
}
