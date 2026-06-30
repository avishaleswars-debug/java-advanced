package Designpatterns;
public class Singleton{
     private Singleton(){
        System.out.println("initiated");
    }
   private static  Singleton s;
    public static  Singleton getobj(){
if(s==null){
   s= new Singleton();
}return s;
    }
    
}
 class A{
    public static void main(String args[]){
System.out.println(Singleton.getobj());
System.out.println(Singleton.getobj());

Singleton.getobj();
    }
}