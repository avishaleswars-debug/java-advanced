package Designpatterns.creationalpattern;
interface Transport {
 void printv();
}
class BusMode implements Transport{
public void printv(){
System.out.println("bus transport mode");
}
}
class ShipMode implements Transport{
public void printv(){
System.out.println("ship transport mode");
}
}
class Factory{
public static Transport getobj(String type){
    if(type.equals("ship")){
        return new ShipMode();
    }
     if(type.equals("bus")){
        return new BusMode();
    }
    return null;
}
}
public class FactoryMethod {
    public static void main(String[] args) {
        Transport obj=Factory.getobj("ship");
        obj.printv();
    }
}
