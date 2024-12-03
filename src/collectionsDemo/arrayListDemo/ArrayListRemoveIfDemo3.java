package collectionsDemo.arrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIfDemo3 {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(112);
        al.add(23);
        al.add(21);
        al.add(322);
        al.add(111);
        al.add(35);
        al.add(10);
        System.out.println(al);

        // Problem statement : remove all 3-digit numbers
        // choose a variable the use predicate symbol
        // -> : predicate symbol
        // put the condition

    //    al.removeIf(num ->  num > 99  );
       al.removeIf(num ->  num >= 100  );

        System.out.println(al);






    }
}
