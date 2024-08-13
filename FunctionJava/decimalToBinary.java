package FunctionJava;
public class decimalToBinary {
    public static void decToBin(int n){
        int decNum = n;
        int pow = 0;
        int rem;
        int binNum =0;
        while(decNum > 0){
            rem = decNum % 2;
            binNum = binNum + rem * (int)Math.pow(10,pow);
            pow++;
            decNum = decNum/2;
        }
        System.out.println("Binary number of " + n +"=" + binNum);
    }
    public static void main(String[] args){
        decToBin(7);
    }
}
