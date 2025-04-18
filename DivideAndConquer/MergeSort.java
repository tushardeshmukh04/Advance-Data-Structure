package DivideAndConquer;

public class MergeSort {
    public static void mergeSort(int[] arr, int si, int ei){
        if(si >= ei){
            return;
        }
        // Work
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }
    public static void merge(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];
        int i = si; // iterator for left part
        int j = mid+1; // iterator for right part
        int k = 0; // iterator for temp arr

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // left Part
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        // Right Part
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        // copy temp array into original array
        for(k = 0, i = si; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }

    }
    public static void printArr(int[] arr) {
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8,1};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);

    }
}
