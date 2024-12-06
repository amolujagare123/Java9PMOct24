package collectionsDemo.MapsDemo;

import java.util.HashMap;

public class HashMapDemo2 {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(31, "One");
        hm.put(52, "Two");
        hm.put(13, "Three");
        hm.put(84, "Four");
        hm.put(65, "Five");
        hm.put(76, "Six");
        hm.put(97, "Seven");

        System.out.println(hm);

        System.out.println( hm.get(65));

        hm.remove(65);

        System.out.println(hm);

        System.out.println(hm.containsKey(65));
        System.out.println(hm.containsValue("Three1"));

        System.out.println("size="+hm.size());

        hm.clear();

        System.out.println(hm);
    }
}
