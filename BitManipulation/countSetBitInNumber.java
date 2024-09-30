package BitManipulation;

public class countSetBitInNumber {
    public static int countSetbit(int n) {
        int count = 0;
        while(n > 0) {
            // check our LSB == 1
            if( (n & 1) == 1) {
                count++ ;
            }
            n = n >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSetbit(16));
    }
}
