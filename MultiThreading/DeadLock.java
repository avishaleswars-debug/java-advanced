package MultiThreading;

public class DeadLock {
     public static void main(String[] args) throws Exception {
           Object lock1=new Object();
                   Object lock2=new Object();

        Thread t1=new Thread(()->{
           synchronized(lock1){
            try {
            Thread.sleep(100);
           } catch (Exception e) {
            // TODO: handle exception
           }System.out.println("thread 1");
           synchronized(lock2){
System.out.println("thread 2");

           }


           }
           
            
                
            
        });
          Thread t2=new Thread(()->{
            synchronized(lock2){
                try {
            Thread.sleep(100);
           } catch (Exception e) {
            // TODO: handle exception
           }
System.out.println("thread 2");
   synchronized(lock1){
System.out.println("thread 1");

           }
           }
           
           
          
        });
        t1.start();
        t2.start();
}}
