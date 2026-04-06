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
interface Factory{
    Transport getobj();
}
class Ship implements Factory{
public Transport getobj(){
return new ShipMode();
}
}
class Bus implements Factory{
public Transport getobj(){
return new BusMode();
}
}
public class FactoryDesign2 {
    public static void main(String[] args) {
        Factory obj=new Bus();
        Transport object=obj.getobj();
        object.printv();
    }
}
