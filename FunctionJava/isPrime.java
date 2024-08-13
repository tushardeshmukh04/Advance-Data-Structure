package FunctionJava;
import java.util.Scanner;
public class isPrime {
    public static boolean numberIsPrime(int n){
        if(n == 2){
            return true;
        } else if(n == 0 || n == 1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(numberIsPrime(n));
        sc.close();
    }
}
