package ArrayInJava.SortingAlgorithms;

public class bubbleSorting {
    public static void bubbleSort(int[] arr){
       int temp;
       for(int i=0; i < arr.length - 1; i++){
           for(int j=0; j < (arr.length -1) - i; j++){
               if(arr[j] > arr[j+1]){
                   temp = arr[j]; 
                   arr[j] =arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }
        for (int j : arr) {
            System.out.print(" " + j);
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        bubbleSort(arr);
    }
}
