package ObjectsAndClasses;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class SerializationAndDeserialization implements Serializable{
    String name;
    int age;
    public SerializationAndDeserialization(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class Serialization{
    public static void main(String[] args)  throws Exception{
        SerializationAndDeserialization sd=new SerializationAndDeserialization("ajay",16);
        FileOutputStream fo=new FileOutputStream("file.txt");
        ObjectOutputStream oi=new ObjectOutputStream(fo);
        oi.writeObject(sd);
        FileInputStream fi=new FileInputStream("file.txt");
        ObjectInputStream oo=new ObjectInputStream(fi);
        SerializationAndDeserialization sd2=(SerializationAndDeserialization) oo.readObject();
          System.out.println(sd2.name);
        System.out.println(sd2.age);
        oo.close();;
        oi.close();
    }
}
