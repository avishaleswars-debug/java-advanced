package Streams;
import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
arr.add(10);
arr.add(20);
arr.add(30);
arr.stream()
.map((n)->n*10)
.forEach(System.out::println);
    }
}
