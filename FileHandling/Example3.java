package FileHandling;

import java.io.*;
import java.util.*;
public class Example3 {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        FileWriter fw=new FileWriter("Hello.txt",true);
        BufferedWriter bw=new BufferedWriter(fw);
    int nn;
    do {
        System.out.println("enter the string");
        String str=s.nextLine();
        bw.write(str);
        bw.newLine();
        System.out.println("enter num");
         nn=s.nextInt();
         s.nextLine();
    } while (nn!=0);
    s.close();
    bw.close();
    }
}
