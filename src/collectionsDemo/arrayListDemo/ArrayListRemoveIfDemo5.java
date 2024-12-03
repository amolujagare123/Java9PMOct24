package collectionsDemo.arrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIfDemo5 {

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

        // Problem statement : remove all string ending with a
        // choose a variable the use predicate symbol
        // -> : predicate symbol
        // put the condition


      // al.removeIf(str ->  str.endsWith("a")  );

        al.removeIf(str -> str.charAt(str.length() -1)=='a');

        System.out.println(al);






    }
}
