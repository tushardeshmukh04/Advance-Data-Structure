package Hashing.HashMap;
import com.sun.security.jgss.GSSUtil;

import java.util.HashMap;
public class OperationOfHashMap {
    public static void main(String[] args){
        // create
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert - O(1)
        hm.put("india" , 100);
        hm.put("us", 150);
        hm.put("china", 50);

        System.out.println(hm);

        // Get - O(1)
        int population = hm.get("india");
        System.out.println(population);

        System.out.println(hm.get("indonesia")); // null return

        // ContainsKey - O(1)
        System.out.println(hm.containsKey("china"));
        System.out.println(hm.containsKey("indonesia"));

        // remove - O(1)
        System.out.println(hm.remove("us"));
        System.out.println(hm.remove("indonesia"));

        // Size
        System.out.println(hm.size());

        // is empty
        System.out.println(hm.isEmpty());

        // clear : delete all data
        hm.clear();
        System.out.println(hm.isEmpty());

    }
}
