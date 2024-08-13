package FunctionJava;

public class functionOverloading {
    public static int Sum(int a, int b){
        return a + b;
    }
    public static float Sum(float a, float b){
        return a + b;
    }
    public static void main(String[] ar){
        System.out.println(Sum(4,5));
        System.out.println(Sum(3.4f, 4.6f));
    }
}
