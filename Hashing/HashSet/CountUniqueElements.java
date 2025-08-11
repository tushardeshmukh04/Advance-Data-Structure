package Hashing.HashSet;

import java.util.HashSet;

public class CountUniqueElements {
    public static int count(int arr[]){
        HashSet<Integer> num = new HashSet<>();
        for(int i=0; i < arr.length; i++){
            num.add(arr[i]);
        }
        return num.size();
    }
    public static void main(String[] args) {
        int[] arr = {4,3, 2, 5, 6, 7, 3, 4, 2, 1};
        System.out.println(count(arr));
    }
}
