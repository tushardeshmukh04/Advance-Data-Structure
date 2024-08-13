package FunctionJava;
import java.util.Scanner;
public class calculateSum {
    public static void CALSUM(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("Addition is: "+sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("\nEnter the value of b: ");
        int b = sc.nextInt();
        CALSUM(a,b);
        sc.close();
    }
}
