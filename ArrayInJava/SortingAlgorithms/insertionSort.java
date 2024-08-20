package ArrayInJava.SortingAlgorithms;

public class insertionSort {
    public static void insertionSorting(int[] arr){
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int previous = i-1;
            /* finding out the correct position to insert */
            while(previous >= 0 && arr[previous] > current){
                arr[previous + 1] = arr[previous];
                previous--;
            }
            //insertion
            arr[previous + 1] = current;
        }
        for(int j : arr){
            System.out.print(" " + j);
        }
    }
    public static void main(String[] args) {
        int[] arr ={5,4,1,3,2};
        insertionSorting(arr);
    }
}
