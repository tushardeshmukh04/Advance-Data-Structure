package Hashing.HashMap;

import java.util.HashMap;
import java.util.Set;

public class IterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for(String key : keys){
            System.out.println("Key= " + key +",Value= "+hm.get(key));
        }
    }
}
