package collectionsDemo.arrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIfDemo1 {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(23);
        al.add(21);
        al.add(32);
        al.add(111);
        al.add(35);
        al.add(10);
        System.out.println(al);

        // Problem statement : remove all the odd numbers from the list
        // choose a variable the use predicate symbol
        // -> : predicate symbol
        // put the condition

        al.removeIf(num ->  num%2 != 0  );

        System.out.println(al);






    }
}
