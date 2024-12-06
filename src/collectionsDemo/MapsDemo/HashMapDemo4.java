package collectionsDemo.MapsDemo;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo4 {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(101, "Aarav");
        hm.put(102, "Ananya");
        hm.put(103, "Ishaan");
        hm.put(104, "Meera");
        hm.put(105, "Aditya");
        hm.put(106, "Priya");
        hm.put(107, "Rohan");

        System.out.println(hm);

        Set keySet = hm.keySet();
        System.out.println("keySet="+keySet);

        Collection values= hm.values();
        System.out.println("values="+values);

        Set entrySet = hm.entrySet();
        System.out.println("entrySet="+entrySet);

    }
}
