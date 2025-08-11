package Hashing.HashSet;

import java.util.HashSet;

public class OperationsOfHashSet {
    public static void main(String[] args) {
        // create
        HashSet<Integer> set = new HashSet<>();

        // Add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);

        // Contains element
        if(set.contains(1)){
            System.out.println("element 1 present");
        }
        if(set.contains(4)){
            System.out.println("Element 4 present");
        }

        // remove
        set.remove(3);
        if(set.contains(3)){
            System.out.println("Element 3 present");
        }

        // size()
        System.out.println(set.size());

        // isEmpty()
        System.out.println(set.isEmpty());

        // clear()
        set.clear();
        System.out.println(set.isEmpty());
    }
}
