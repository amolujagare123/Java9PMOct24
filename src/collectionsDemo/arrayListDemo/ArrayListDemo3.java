package collectionsDemo.arrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo3 {

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

        System.out.println("al="+al);

        ArrayList<String> al2 = new ArrayList<>();

        System.out.println("al2="+al2);

        al2.addAll(al);
        System.out.println("after adding all the other list elements");
        System.out.println("al2="+al2);



    }
}
