package collectionsDemo.MapsDemo;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<Integer, String> hm = new TreeMap<>();

        hm.put(101, "Aarav");
        hm.put(106, "Priya");
        hm.put(103, "Ishaan");
        hm.put(104, "Meera");
        hm.put(102, "Ananya");
        hm.put(105, "Aditya");
        hm.put(107, "Rohan");

        System.out.println(hm);



    }
}
