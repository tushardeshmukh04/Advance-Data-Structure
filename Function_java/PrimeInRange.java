package Function_java;
import java.util.Scanner;
public class PrimeInRange {
    public static void PrintPrime(int n){
        for(int i=2; i<=n; i++){
            if(IsPrime.isprime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ente the range: ");
        int n = sc.nextInt();
        PrintPrime(n);
        sc.close();
    }
}
