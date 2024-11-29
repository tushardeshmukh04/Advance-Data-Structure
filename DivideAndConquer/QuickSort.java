package DivideAndConquer;

public class QuickSort {
    public static void quickS(int[] arr, int si, int ei) {
        if(si >= ei) {
            return;
        }
        int pIdx = partision(arr, si, ei);
        quickS(arr, si, pIdx - 1); // left part
        quickS(arr, pIdx + 1, ei); // right part
    }
    public static int partision(int[] arr, int si, int ei){
        int pivot = arr[ei];
        int i = si-1; // to make place for element smaller then pivot

        for(int j = si; j < ei; j++){
            if(arr[j] <= pivot){
                i++;

                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        arr[ei] = arr[i];
        arr[i] = pivot;
        return i;
    }
    public static void printArr(int[] arr) {
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 8, 2, 5,-2};
        quickS(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
