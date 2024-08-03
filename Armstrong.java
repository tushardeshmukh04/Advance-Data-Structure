import java.util.* ;
public class Armstrong
{
    public static void main(String[] ar)
    {
        Scanner sc = new Scanner(System.in) ;
        int number , original_num,sum=0 ;
        System.out.println("Enetr the number :") ;
        number = sc.nextInt() ;
        original_num = number ;
        
        while(original_num>0)
        {
            int reminder = original_num%10 ;
            sum += reminder*reminder*reminder ;
            original_num = original_num /10 ;
        }
        if(sum==number)
        {
            System.err.println("\n Number is armstring") ;
        }
        else
        {
            System.out.println("\n Number is not armstrong");
        }
        


    }
}