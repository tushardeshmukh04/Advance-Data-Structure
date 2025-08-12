package Hashing.HashMap;

import java.util.HashMap;

public class LargestSubarrayWithSumZero {
    public static int lengthofSubarray(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int length = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
            if(hm.containsKey(sum)){
                length = Math.max(length, i - hm.get(sum));
            } else {
                hm.put(sum, i);
            }
        }
        return length;
    }
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10};
        System.out.println(lengthofSubarray(arr));
    }
}
