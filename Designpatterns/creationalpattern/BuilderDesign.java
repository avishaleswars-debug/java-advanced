package Designpatterns.creationalpattern;
class Computer {
    private String cpu;
    private String ram;
    private String storage;

    public void setCPU(String cpu) { this.cpu = cpu; }

    public void setRAM(String ram) { this.ram = ram; }

    public void setStorage(String storage)
    {
        this.storage = storage;
    }

    public void displayInfo()
    {
        System.out.println("Computer Configuration:\n"
                           + "CPU: " + cpu + "\n"
                           + "RAM: " + ram + "\n"
                           + "Storage: " + storage + "\n");
    }
}
// Builder interface
interface Builder {
    void buildCPU();
    void buildRAM();
    void buildStorage();
    Computer getResult();
}
class GamingComputerBuilder implements Builder {
     private Computer computer = new Computer();
      public void buildCPU()
    {
        computer.setCPU("Gaming CPU");
    }

    public void buildRAM() { computer.setRAM("16GB DDR4"); }

    public void buildStorage()
    {
        computer.setStorage("1TB SSD");
    }
    public Computer getResult() { return computer; }
}
public class BuilderDesign {
public static void main(String[] args) {
    
}
    
}
