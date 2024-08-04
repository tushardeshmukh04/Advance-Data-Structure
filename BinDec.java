import java.util.*;
public class BinDec {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number; ");
        int num1 = sc.nextInt();
        int num2 = num1;
        double power = 0;
        double dec = 0;
        while(num2>0){
            int lastdigit =num2 % 10;
            dec = dec + (lastdigit * Math.pow(2, power));
            power++;
            num2 = num2 / 10;
        }
        System.out.println("Decimal Number is :"+dec);
        sc.close();
    }
}
