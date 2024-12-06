package collectionsDemo.VectorDemo;

import java.util.Vector;

public class VectorDemo2 {

    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        System.out.println("size="+v.size());
        System.out.println("capacity="+v.capacity());

        v.add("Amit");
        v.add("Rohit");
        v.add("Priya");
        v.add("Anjali");
        v.add("Sunita");
        v.add("Rahul");
        v.add("Neha");
        v.add("Vikram");
        v.add("Neha");
        v.add("Vikram");
        v.add("Vikram");
        v.add("Amit");
        v.add("Rohit");
        v.add("Priya");
        v.add("Anjali");
        v.add("Sunita");
        v.add("Rahul");
        v.add("Neha");
        v.add("Vikram");
        v.add("Neha");
        v.add("Neha");

        System.out.println(v);
        System.out.println("size="+v.size()); // 21
        System.out.println("capacity="+v.capacity()); //20

    }
}
