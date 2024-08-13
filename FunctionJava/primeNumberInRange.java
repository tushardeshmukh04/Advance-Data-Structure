package FunctionJava;
import java.util.Scanner;
public class primeNumberInRange {
    public static void PrintPrime(int n){
        for(int i=2; i<=n; i++){
            if(isPrime.numberIsPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = sc.nextInt();
        PrintPrime(n);
        sc.close();
    }
}
