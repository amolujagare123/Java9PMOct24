package collectionsDemo.arrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo1 {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(23);
        al.add(21);
        al.add(45);
        System.out.println(al);
      //  al.remove(1);
        al.remove(new Integer(23));
        System.out.println(al);



    }
}
