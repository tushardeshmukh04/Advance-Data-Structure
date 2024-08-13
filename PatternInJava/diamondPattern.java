package PatternInJava;

import java.util.Scanner;

public class diamondPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number: ");
        int n = sc.nextInt();
        //first half
        for(int i=1; i<=n; i++){
            //print space
            for(int j=1; j<=n-i ;j++){
                System.out.print(" ");
            }
            //print star
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for(int i=n; i>=1; i--){
            //print space
            for(int j=1; j<=n-i ;j++){
                System.out.print(" ");
            }
            //print star
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
