package collectionsDemo.arrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo2 {

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
        System.out.println("size="+al.size());
        System.out.println(al.get(4));

        System.out.println("printing using for loop");
        for(int i=0;i<al.size();i++)
            System.out.println(al.get(i));

        System.out.println("printing using for each loop");
        for(String str:al)
            System.out.println(str);



        /*al.remove(2);
        al.remove("amol4");

        System.out.println(al);*/
    }
}
