package ArrayInJava.SubarraysInJava;

public class subarrays {
    public static void printSubarrays(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum = sum + arr[k];
                    System.out.print(arr[k]+" ");
                }
                if(max < sum){
                    max = sum;
                }
                if(min > sum){
                    min = sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maximum addition of subArrays is:"+ max);
        System.out.println("Minimum addition of subArrays is:"+ min);
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        printSubarrays(arr);
    }
}
