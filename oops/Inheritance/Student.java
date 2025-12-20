package Inheritance;
class S1{
    void fun(){
        System.out.println("S1 function");
    }
    void get1(){

    }
}
    class S2 extends S1{
        @Override
        void fun(){
            super.fun();
            System.out.println("s2 function");
        }
        
        void fun2(){
            System.out.println("hello");
        }
        @Override
        void get1(){
            System.out.println("Success");
        }
    }
        class  S3 extends S2{
            @Override
            void fun(){
                super.fun();
                System.out.println("s3 funtion");
            }
        }
    

public class Student {
    public static void main(String[] args) {
        S3 s=new S3();
        S1 ss;
        ss=new S2();
        ss.get1();
        s.fun();
        s.fun2();
        
    }
}
