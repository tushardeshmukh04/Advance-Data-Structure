package FunctionJava;
import java.util.Scanner;
public class factorial {
    public static int factorialOfNumber(int a){
        int f = 1;
        for(int i=1; i<=a; i++){
            f = f*i;
        }
        return f;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the no. that do you want to calculate factorial: ");
        int f = sc.nextInt();
        int fact =  factorialOfNumber(f);
        System.out.println("Factorial is: " + fact);
        sc.close();
    }
}
