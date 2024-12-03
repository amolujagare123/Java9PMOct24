package collectionsDemo.arrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIfDemo4 {

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

        // Problem statement : remove all string whose length is less than or equal to 5
        // choose a variable the use predicate symbol
        // -> : predicate symbol
        // put the condition


       al.removeIf(str ->  str.length() <=5  );

        System.out.println(al);






    }
}
