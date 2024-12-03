package collectionsDemo.arrayListDemo;

import java.util.ArrayList;

public class ArrayListSetDemo2 {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("Amit");
        al.add("Rohit");
        al.add("Priya");
        al.add("Anjali");
        al.add("Sunita");
        al.add("Rahul");
        al.add("Neha");
        al.add("Vikram");
        System.out.println(al);

        al.set(5,"sneha");

        System.out.println(al);




    }
}
