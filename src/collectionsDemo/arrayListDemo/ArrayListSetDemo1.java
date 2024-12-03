package collectionsDemo.arrayListDemo;

import java.util.ArrayList;

public class ArrayListSetDemo1 {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(23);
        al.add(21);
        al.add(45);
        System.out.println(al);

        al.set(2,100);

        System.out.println(al);




    }
}
