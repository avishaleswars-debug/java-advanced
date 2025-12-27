package SOLID;
 interface shape{
    int area();
}
 class Circle implements shape{
public int area(){
return 3+6;
}
}
 class Rectangle implements shape{
public int area(){
return 3*6;
}
}
 class CalArea{
    int calarea(shape obj) {
        return obj.area();
    }
}

public class O {
    public static void main(String[] args) {
        shape s=new Circle();
        shape ss=new Rectangle();
CalArea c=new CalArea();
int re=c.calarea(s);
System.out.println(re);
    }
}
