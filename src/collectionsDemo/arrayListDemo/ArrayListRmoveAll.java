package collectionsDemo.arrayListDemo;

import java.util.ArrayList;

public class ArrayListRmoveAll {

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

        al2.add("Rohit");
        al2.add("Anjali");
        al2.add("Rahul");
        al2.add("Vikram");
        al2.add("Meera");
        al2.add("Karan");
        al2.add("Sneha");
        al2.add("Arjun");
        System.out.println("al2="+al2);


        al2.removeAll(al);

        System.out.println("al2="+al2);



    }
}
