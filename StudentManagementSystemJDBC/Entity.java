package StudentManagementSystemJDBC;


public class Entity {
    private String name;
    private int num;
    private int mark;
public Entity(String name,int num,int mark){
    this.name=name;
    this.num=num;
    this.mark=mark;
}
public void setname(String name){
this.name=name;
}
public void setnum(int num){
this.num=num;
}
public void setmark(int mark){
this.mark=mark;
}
public String getname(){
    return name;
}
public int getnum(){
    return num;

}
public int getmark(){
    return mark;
}


}

