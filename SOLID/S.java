package SOLID;
class Employee{
    public  void name(){
        System.out.print("Employee name");
    }
}
class EmployeeSalary{
    public  void salary(){
        System.out.print("Employee salary");
    }
}


public class S {
    public static void main(String[] args) {
        EmployeeSalary es=new EmployeeSalary(); 
    es.salary();
    }
}
