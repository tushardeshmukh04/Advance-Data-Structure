package Hashing.HashMap;

import java.util.HashMap;

public class SubarraySumEqualToK {
    public static void main(String[] args) {

        int[] arr = {1,2,3};
        int k = 3;
        HashMap<Integer, Integer> map = new HashMap<>(); // sum, count
        int sum = 0;
        int count = 0;
        map.put(0,1);
        for(int j =0 ; j < arr.length; j++){
            sum += arr[j]; // sum[j]
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0) +1);
        }
        System.out.println(count);
    }


}