package ArrayInJava;

public class largestNumber {
    public static int largestNum(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 5, 6, 3, 9, 8};
        int result = largestNum(arr);
        System.out.println("Largest number is: " + result);
    }


}
