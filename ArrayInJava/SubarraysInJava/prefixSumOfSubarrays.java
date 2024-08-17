package ArrayInJava.SubarraysInJava;

public class prefixSumOfSubarrays {
    public  static void maxSubarraysSum(int[] arr){
        int[] prefix = new int[arr.length];
        int maxSum = Integer.MIN_VALUE;
        prefix[0] = arr[0];
        //calculate prefixSum array
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        // Calculate maximum  sum of subarrays ;
        for(int i=0; i<arr.length; i++){
            int currSum = 0;
            for(int j=0; j<arr.length; j++){
              currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
            }
            if(maxSum < currSum){
                maxSum = currSum;
            }
        }
        System.out.println("Maximum sum of subarrays is : " + maxSum);
    }
    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        maxSubarraysSum(arr);
    }
}
