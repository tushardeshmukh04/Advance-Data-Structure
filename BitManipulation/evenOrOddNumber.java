package BitManipulation;

public class evenOrOddNumber {
    public static boolean checkNoIsEvenOrOdd(int number) {
       //odd case
        if((number & 1) == 0) {
           return true;
        }

        return false;
    }
    public static void main(String[] args) {
        if(checkNoIsEvenOrOdd(7)) {
            System.out.println("number is prime");
        }
        else {
            System.out.println("number is not prime");
        }
    }
}
