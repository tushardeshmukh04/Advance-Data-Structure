package Recursion;

public class PrintXToTHePowerOfN {
    public static int printPower(int x, int n) {
        // time complexity = O(N);
        if(n == 0){
            return 1;
        }
        return x * printPower(x ,n-1);
    }
    public static int optimizedPower(int x, int n) {
        // time complexity = O(logN);
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;
        if(n % 2 != 0){
            halfPowerSq *= x;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(printPower(x, n));
        System.out.println(optimizedPower(x, n));
    }
}
