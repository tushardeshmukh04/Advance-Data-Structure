package Recursion;

public class PrintFactorialOfNumber {
    public static int printFact(int n) {
        if(n == 0) {
            return 1;
        }
        int fact = printFact(n-1);
        int result = n * fact;
        return result;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(printFact(n));
    }
}
