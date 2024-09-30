package BitManipulation;

public class EvenOrOddNumber {
    public static boolean checkNoIsEvenOrOdd(int number) {
        int bitMask = 1;
        //odd case
        if((number & bitMask) == 0) {
           return true;
        }

        return false;
    }
    public static void main(String[] args) {
        if(checkNoIsEvenOrOdd(7)) {
            System.out.println("number is even");
        }
        else {
            System.out.println("number is odd");
        }
    }
}
