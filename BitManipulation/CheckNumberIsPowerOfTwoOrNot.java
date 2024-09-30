package BitManipulation;

public class CheckNumberIsPowerOfTwoOrNot {
    public static boolean numberIsPowerOfTwo(int number) {
        return (number & (number - 1)) == 0;
    }
    public static void main(String[] args) {
        int number = 16;
        System.out.println(numberIsPowerOfTwo(number));
    }
}
