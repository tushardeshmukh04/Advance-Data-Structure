package BitManipulation;

public class setIthBit {
    public static int setBit(int n, int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        System.out.println(setBit(10,2));
    }
}
