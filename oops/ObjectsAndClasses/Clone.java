package ObjectsAndClasses;
public class Clone implements Cloneable{
    String name="ajay";
   protected Object clne()throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String[] args) {
        try{
 Clone c=new Clone();
        Clone c2=(Clone)c.clne();
        System.out.println(c2.name);
        }
        catch( Exception e){
            System.out.println(e);
        }
    }
}
