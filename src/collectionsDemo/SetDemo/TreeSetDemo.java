package collectionsDemo.SetDemo;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet ts = new TreeSet();
        ts.add("Amit");
        ts.add("Rohit");
        ts.add("Priya");
        ts.add("Anjali");
        ts.add("Sunita");
        ts.add("Rahul");
        ts.add("Neha");

        ts.add("Vikram");
        ts.add("Vikram");
    //    ts.add(23);
        System.out.println(ts);
    }
}
