package StudentManagementSystemJDBC;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
     //   Entity ss=new Entity();
        Student st=new Student();
        while(true){
        System.out.println("1 Add students");
        System.out.println("2 view Students");
        System.out.println("3 get students");
        System.out.println("4 delete students");
        System.out.println("5 updtae students");
        System.out.println("6 exit students");
        int n=s.nextInt();
        s.nextLine();
        switch (n) {
            case 1:
                System.out.println("enter the name");
                String name=s.nextLine();
                System.out.println("eneter the ro num");
                int num=s.nextInt();
                s.nextLine();
                System.out.println("enter the marks");
                int mark=s.nextInt();
                s.nextLine();
                st.add(new Entity(name,num,mark));
                break;
        case 2:
       st.view();
        break;
        case 3:
            System.out.println("enter the num");
            int va=s.nextInt();
            s.nextLine();
            st.get(va);
            break;
   //    case 4:
   //     ss.delete();
     //   break;
    //    case 5:
    //    ss.update();
      //      break;
        case 6:
             return ;
            default:
                System.out.print("wrong input");
                break;
        }
        }
    }
}
