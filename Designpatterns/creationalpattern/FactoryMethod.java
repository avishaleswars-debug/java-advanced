package Designpatterns.creationalpattern;
abstract class Transport {
abstract void printv();
}
class BusMode extends Transport{
public void printv(){
System.out.println("bus transport mode");
}
}
class ShipMode extends Transport{
public void printv(){
System.out.println("ship transport mode");
}
}
public interface InnerFactoryMethod {
Transport vehicletype();
    
}
class Bus implements InnerFactoryMethod{
    Transport vehicletype(){
        return new BusMode();
    }
}
class Ship implements InnerFactoryMethod{
    Transport vehicletype(){
        return new ShipMode();
    }
}

public class FactoryMethod {
    public static void main(String[] args) {
        InnerFactoryMethod fmcar=
    }
}
