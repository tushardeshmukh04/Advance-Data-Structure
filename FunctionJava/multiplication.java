package FunctionJava;
import java.util.Scanner;
public class multiplication {
    public static int Multiply(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("\nEnter the value of b: ");
        int b = sc.nextInt();
        int product = Multiply(a, b);
        System.out.println("Multiplication is: " + product);
        sc.close();
    }
}
