package FunctionJava;

public class binomialCoefficient {
    public static int BinomialCuff(int n, int r){//Bionomial Coefficient
        int fact_n = factorial.factorialOfNumber(n);// calling the function from another class
        int fact_r = factorial.factorialOfNumber(r);
        int fact_nr = factorial.factorialOfNumber(n-r);
        int bin_cuff = fact_n / (fact_r*fact_nr);
        return bin_cuff;
    }
    public static void main(String[] args){
        int BinCoeff = BinomialCuff(4, 2);
        System.out.println("Binomial Coefficient is : " + BinCoeff);

    }
}
