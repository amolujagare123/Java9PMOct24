package collectionsDemo.arrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo2 {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("amol1");
        al.add("amol2");
        al.add("amol3");
        al.add("amol4");

        System.out.println(al);

        al.remove(2);
        al.remove("amol4");

        System.out.println(al);
    }
}
