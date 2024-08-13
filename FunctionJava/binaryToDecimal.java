package FunctionJava;
import java.util.Scanner;
public class binaryToDecimal {
    public static int BinNum(int num){
        int num2 = num;
        int pow = 0;
        int lastDigit ;
        int decNum = 0;
        while(num2 > 0){
            lastDigit = num2 % 10 ;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
            pow ++;
            num2 = num2 / 10;
        }
        return decNum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thr binery number :");
        int num = sc.nextInt();
        System.out.println("Decimal number of "+num+"="+ BinNum(num));
        sc.close();
    }
}
