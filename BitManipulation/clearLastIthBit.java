package BitManipulation;

public class clearLastIthBit {
    public static int clearLastBit(int n, int i) {
        int bitMask = (-1)<<i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearLastBit(15,2));
    }
}
