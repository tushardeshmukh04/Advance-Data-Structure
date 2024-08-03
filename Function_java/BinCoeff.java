package Function_java;
public class BinCoeff {
    public static int BinomialCoeff(int n, int r){//Bionomial Coefficient
        int fact_n = Factorial.factorial(n);// calling the function from another class
        int fact_r = Factorial.factorial(r);
        int fact_nr = Factorial.factorial(n-r);
        int bin_coeff = fact_n / (fact_r*fact_nr);
        return bin_coeff;
    }
    public static void main(String args[]){
        int BinCoeff = BinomialCoeff(4, 2);
        System.out.println("Binomial Coefficient is : " + BinCoeff);
        
    }

}
