package StudentManagementSystem;

public class Entity {
    private String name;
    private int num;
    private double mark;
public Entity(String name,int num,double mark){
    this.name=name;
    this.num=num;
    this.mark=mark;
}
void setname(String name){
this.name=name;
}
void setnum(int num){
this.num=num;
}
void setmark(double mark){
this.mark=mark;
}
String getname(){
    return name;
}
int getnum(){
    return num;

}
double getmark(){
    return mark;
}
@Override
public String toString(){
    return " the name is "+name+" and the number is " +num+" the mark is "+mark;
}

}
