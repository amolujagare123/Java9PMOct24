package collectionsDemo.MapsDemo;

import java.util.HashMap;

public class HashMapDemo3 {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(31, "One");
        hm.put(52, "Two");
        hm.put(13, "Three");
        hm.put(84, "Four");
        hm.put(65, "Five");
        hm.put(76, "Six");
        hm.put(97, "Seven");


        System.out.println("hm="+hm);

        HashMap<Integer, String> hm2 = new HashMap<>();

        System.out.println("hm2="+hm2);

        hm2.putAll(hm);
        System.out.println("hm2="+hm2);





    }
}
