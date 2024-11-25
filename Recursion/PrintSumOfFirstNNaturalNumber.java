package Recursion;

public class PrintSumOfFirstNNaturalNumber {
    public static int printSum(int n) {
        if(n == 1) {
            return 1;
        }
        int result = printSum(n - 1);
        int sum = n + result;
        return sum;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(printSum(n));
    }
}
