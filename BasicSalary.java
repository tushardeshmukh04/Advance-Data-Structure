/*Write JAVA program tocalculate salary of an employee given him basic pay. calculate gross salary of employee .let HRA be 10% of 
basic pay and TA be 5% of basic pay. let employee pay professional tax as 2% of total salary.
 Calculate net salary payable after deduction.
*/
import java.util.* ;
public class BasicSalary
{
    public static void main(String [] ar)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("\n ENter the basic salary :") ;
        int salary = sc.nextInt() ;
        double HRA = 0.1*salary ;
        double TA = 0.05*salary ;
        double total_salary = salary + HRA +TA ;
        double tax = 0.02*total_salary ;
        double gross_salary = total_salary - tax ;
        System.out.println("\n-----------SALARY dISTRIBUTION -----------");
        System.out.println("\n Basic salary of Employee :" +salary) ;
        System.out.println("\n House rent allowance :" +HRA);
        System.out.println("\n Travelling allowance :" +TA) ;
        System.out.println("\n Total salary of employee :" +total_salary) ;
        System.out.println("\n Tax on total salary : " +tax) ;
        System.out.println("\n Gross salary of employee :" +gross_salary);

    }
}