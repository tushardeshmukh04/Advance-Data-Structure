package Function_java;

import java.util.Scanner;

public class BinToDec {
    public static int BinNum(int num){
        int pow = 0;
        int lastDigit ;
        int decNum = 0;
        while(num > 0){
            lastDigit = num % 10 ;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
            pow ++;
            num = num / 10;
        }
        return decNum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thr binery number :");
        int num = sc.nextInt();
        System.out.println("Decimal number is :"+ BinNum(num));
        sc.close();
    }
}
