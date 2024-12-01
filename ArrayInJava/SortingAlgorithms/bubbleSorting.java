package ArrayInJava.SortingAlgorithms;

public class bubbleSorting {
    public static void bubbleSort(int[] arr){
       int temp;
       for(int i=0; i < arr.length - 1; i++){
           boolean sort = false;
           for(int j=0; j < (arr.length -1) - i; j++){
               if(arr[j] > arr[j+1]){
                   temp = arr[j]; 
                   arr[j] =arr[j+1];
                   arr[j+1] = temp;
                   sort = true;
               }
           }
           if(sort == false){
               System.out.println("Array is Sorted");
               break;
           }
       }
        for (int j : arr) {
            System.out.print(" " + j);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        bubbleSort(arr);
    }
}
