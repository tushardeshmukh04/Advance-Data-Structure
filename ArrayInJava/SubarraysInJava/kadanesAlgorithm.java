package ArrayInJava.SubarraysInJava;

public class kadanesAlgorithm {
    public static int kadanes(int[] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int j : arr){
            currSum += j;
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3}; //array contain at least one non -ve number for kadane`s approach
         int maxSum = kadanes(arr);
        System.out.println("Maximum sum of subArrays : "+ maxSum);
    }
}
