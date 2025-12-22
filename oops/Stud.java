 interface B {
    void a();
}
class A implements B{
@Override
public void a(){
    System.out.println("hello");
}
}
class Stud{
    public static void main(String[] args) {
        A aa=new A();
        aa.a();
    }
}
