package ObjectsAndClasses;
public class CopyConstructor {
    String name;
    int age;
    CopyConstructor(String name,int age){
        this.name=name;
        this.age=age;
    }
    CopyConstructor(CopyConstructor obj){
this.name=obj.name;
this.age=obj.age;
    }
    public static void main(String[] args) {
        CopyConstructor cp=new CopyConstructor("ajay",29);
        CopyConstructor cp2=new CopyConstructor(cp);
        System.out.println(cp2.name);
    }
}
