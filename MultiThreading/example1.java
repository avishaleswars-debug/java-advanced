package MultiThreading;
class ex extends Thread{
public void run(){
    for(int i=0;i<6;i++)
System.out.println("hello world");
}
}
public class example1 extends Thread{
    public void run(){
        for(int i=0;i<6;i++)
        System.out.println("hello");
    }
    public static void main(String[] args) {
        ex e=new ex();
        example1 ee=new example1();
        e.start();
        ee.start();
    }
    
}
