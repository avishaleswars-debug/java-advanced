package SOLID;
interface Salary{
void salary();
}
interface Leave{
    void leave();
}
class Emp implements Salary,Leave{
public void salary(){
System.out.println("salary");
}
 public void leave(){
        System.out.println("leave");
    }
}
class Intern implements Leave{
    public void leave(){
        System.out.println("leave");
    }
}
public class I {
    public static void main(String[] args) {
        Salary s=new Emp();
        s.salary();
         Leave ss=new Emp();
        ss.leave();
    }
}
