package ArrayInJava.SortingAlgorithms;

public class countingSort {
    public static void countingSorting(int[] arr) {
        int maxElement = Integer.MIN_VALUE;
        for (int j : arr) {
            maxElement = Math.max(maxElement, j);
        }
        int[] count = new int[maxElement + 1];
        for (int j : arr) {
            count[j]++;
        }
        int temp = 0;
        for(int i=0; i<count.length; i++) {
           while(count[i] > 0) {
               arr[temp] = i;
               temp++;
               count[i]--;

           }
        }
        for(int i : arr) {
            System.out.print(i + " ");
        }


    }
    public static void main(String[] args) {
        int[] arr= {1,4,1,3,2,4,3,7};
        countingSorting(arr);

    }
}
