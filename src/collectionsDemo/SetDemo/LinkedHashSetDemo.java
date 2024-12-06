package collectionsDemo.SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Amit");
        lhs.add("Rohit");
        lhs.add("Priya");
        lhs.add("Anjali");
        lhs.add("Sunita");
        lhs.add("Rahul");
        lhs.add("Neha");
        lhs.add("Vikram");
        lhs.add("Vikram");
        System.out.println(lhs);
    }
}
