package BackTracking.Array;

public class Example1 {
    public static void ChangeArr(int[] arr, int i, int val){
        if(i == arr.length){
            Print(arr);
            return;
        }
        arr[i] = val;
        ChangeArr(arr, i+1, val+1); // function call step
        arr[i] = arr[i] - 2; // backtracking
    }
    public static void Print(int[] arr){
        System.out.println();
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args){
        int[] arr = new int[5];
        ChangeArr(arr, 0, 1);
        Print(arr);
    }
}
