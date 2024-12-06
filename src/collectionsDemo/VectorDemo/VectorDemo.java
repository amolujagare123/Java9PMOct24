package collectionsDemo.VectorDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        v.add("Amit");
        v.add("Rohit");
        v.add("Priya");
        v.add("Anjali");
        v.add("Sunita");
        v.add("Rahul");
        v.add("Neha");
        v.add("Vikram");

        System.out.println(v);

        System.out.println("printing using Iterator");
        Iterator itr = v.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());

        System.out.println("printing using Enumeration");

        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());
    }
}
