package MultiThreading;

public class JoinThreadExample {
    public static void main(String[] args) throws Exception {
        Thread t1=new Thread(()->{
            for(int i=0;i<20;i++){
                System.out.println("thread 1");
            }
        });
          Thread t2=new Thread(()->{
            for(int i=0;i<20;i++){
                System.out.println("thread 2");
            }
           
        });
         t1.setDaemon(true);
        t1.start();
        t2.setDaemon(true);
        t2.start();
       
      //  t2.setPriority(2);
      t2.join();
      //   System.out.println("thread 3");
    }
}
