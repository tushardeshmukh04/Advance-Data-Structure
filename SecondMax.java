import java.util.*;
public class SecondMax{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array element :");
        for(int i=0; i<n; i++){
           arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(max<arr[i]){
                sec_max = max;
                max = arr[i];
            } else if(sec_max<arr[i]){
                sec_max = arr[i];
            }
        }
        System.out.println("Second max: "+sec_max);
    }
}