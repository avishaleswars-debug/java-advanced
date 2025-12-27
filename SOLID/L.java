package SOLID;
interface Emp{
    void work();
}
interface Leave {
    void leave(int a);
}
class PerEmp implements Emp,Leave{
    public void work(){
System.out.println("work");
    }
public void leave(int a){
System.out.println(a);
    }
}
class TempEmp implements Emp{
   public  void work(){
System.out.println("work");

    }
}
class LeaveEmp{
    public void leaveemp(Leave pe){
        pe.leave(5);
    }
}
public class L {
    public static void main(String[] args) {
        LeaveEmp em=new LeaveEmp();
        Leave l=new PerEmp();
        em.leaveemp(l);
    }
}
