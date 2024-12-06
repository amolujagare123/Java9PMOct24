package collectionsDemo.linkedListDemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Amit");
        ll.add("Rohit");
        ll.add("Priya");
        ll.add("Anjali");
        ll.add("Sunita");
        ll.add("Rahul");
        ll.add("Neha");
        ll.add("Vikram");

        System.out.println(ll);

        ll.addFirst("first");
        ll.addLast("last");

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);

    }
}
