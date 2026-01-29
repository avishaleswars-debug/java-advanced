package SOLID;
 interface InnerD {
void show();
    }
    class B implements InnerD{
        public void show(){
            System.out.println("show B");
        }
    }
    class C implements InnerD{
         public void show(){
            System.out.println("show C");
        }
    }
    class Controller{
        private InnerD obj;
        private String name;
        Controller(InnerD obj,String name){
            this.obj=obj;
            this.name=name;
        }
        void fun(){
            obj.show();
            System.out.println(name);
        }
    }
public class D {
    public static void main(String[] args) {
        InnerD c=new B();
Controller cc=new Controller(c,"one");
cc.fun();
    InnerD cd=new C();
Controller cdc=new Controller(cd,"two");
cdc.fun();
cc.fun(); 
    }
}
