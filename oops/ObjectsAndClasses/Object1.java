package ObjectsAndClasses;
class object1{
    String name;
    int age;
    object1(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return "the name is "+name+" and the age is "+age;
    }
    public static void main(String args[]){
        object1 obj=new object1("ajay",12);
        System.out.print(obj);
    }
}