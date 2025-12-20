package StudentManagementSystem;
import java.util.*;
import java.util.ArrayList;

public class Manage {
        ArrayList<Entity> arr=new ArrayList<>();

        Scanner s=new Scanner(System.in);

void adds(){
    System.out.println("enter name");
    String name=s.nextLine();
    System.out.println("enter roll no");
    int num=s.nextInt();
    s.nextLine();
    System.out.println("enter marks");
    double mark=s.nextDouble();
    s.nextLine();
    Entity en=new Entity(name,num,mark);
arr.add(en);
System.out.println("studnet aded");
}
void view(){
    for(Entity stu:arr){
        System.out.println(stu);
    }
}
void get(){
    System.out.println("Enter the number");
    int n=s.nextInt();
     s.nextLine();

    for(Entity stu:arr){
        if(n==stu.getnum()){
            System.out.println(stu);
            break;
        }
    }
}
void update(){
    System.err.println("enter the number");
    int n=s.nextInt();
     s.nextLine();

    for(Entity stu:arr){
        if(n==stu.getnum()){
           System.out.println("enter the name");
           stu.setname(s.nextLine());
           System.out.println("enter the marks");
           stu.setmark(s.nextDouble());
            break;
        }
    }
}
void delete(){
 System.err.println("enter the number");
 int n=s.nextInt();
 s.nextLine();
 for(Entity stu:arr){
    if(n==stu.getnum()){
        arr.remove(stu);
    }
 }
}
void start(){

    while(true){
        System.out.println("1 Add students");
        System.out.println("2 view Students");
        System.out.println("3 get students");
        System.out.println("4 delete students");
        System.out.println("5 updtae students");
                System.out.println("6 exit students");

        int n=s.nextInt();
        s.nextLine();
        switch(n){
            case 1: adds();
            break;
          case 2: view();
          break;
          case 3: get();
          break;
            case 4: delete();
            break;
           case 5: update();
           break;
           case 6 : 
            System.out.println("exit");
             return;
             
            default : System.out.println("invalid");


        }

    }
}
}
