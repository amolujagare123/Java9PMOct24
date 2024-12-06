package collectionsDemo.MapsDemo;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap hm = new HashMap();

        hm.put(1, "One");
        hm.put("Two", 2);
        hm.put(3.0, 'C');
        hm.put('D', true);
        hm.put(6, null);
        hm.put("NullKey", null);
        hm.put(null, 344);
        hm.put(null, 444);


        System.out.println(hm);

    }
}
