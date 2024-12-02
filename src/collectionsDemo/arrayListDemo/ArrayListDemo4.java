package collectionsDemo.arrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo4 {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        System.out.println("empty ? :"+al.isEmpty());

        al.add("Amit");
        al.add("Rohit");
        al.add("Priya");
        al.add("Anjali");
        al.add("Sunita");
        al.add("Rahul");
        al.add("Neha");
        al.add("Vikram");
        System.out.println("empty ? :"+al.isEmpty());
        System.out.println(al);

        al.clear();
        System.out.println("empty ? :"+al.isEmpty());
        System.out.println(al);

    }
}
