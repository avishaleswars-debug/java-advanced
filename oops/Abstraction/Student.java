package Abstraction;
abstract class Stu{
abstract void fun1();
abstract void fun2();
}
class stu2 extends Stu{
    @Override
    void fun1(){
        System.out.println("hello fun1");
    }
    @Override
    void fun2(){
        System.out.print("hello fun2");
    }
}
public class Student {
    public static void main(String[] args) {
    stu2 s=new stu2();
    s.fun1();
    s.fun2();
    }
}
