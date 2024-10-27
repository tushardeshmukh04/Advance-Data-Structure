package Recursion;

public class PrintNumbers {
    public static void numbers(int n) {
        if (n == 1) {
            System.out.println(n + " ");
            return;
        }
        System.out.println(n + " ");
        numbers(n - 1);
    }
    public static void main(String[] args){
        int n = 10;
        numbers(n);
    }
}
