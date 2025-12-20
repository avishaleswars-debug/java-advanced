package Encapsulation;

public class Student {
    private String name;
    public void setString(String name){
        this.name=name;
    }
    public String gtString(){
        return name;
    }
    public static void main(String[] args) {
        Student stu =new Student();
stu.setString("ajay");
String str=stu.gtString();
System.out.println(str);
    }
}
