package BitManipulation;

public class getIthBit {
    public static int getBit(int n, int i) {
        int bitMask = 1<<i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(getBit(10,2));
    }
}
