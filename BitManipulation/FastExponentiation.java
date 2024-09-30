/*
calculate A to the power N (a^n)
time compexity O(logn)
*/

package BitManipulation;

public class FastExponentiation {
    public static int calculatePower(int a, int n) {
        int ans = 1;
        while(n > 0) {
            if((n & 1) == 1) {
                ans = ans * a;
            }
            a *= a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(calculatePower(5,3));
    }
}
