package LeetcodeProblem;
import java.util.Arrays;
public class medianOfTwoArray {
    public static void findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;
        int size = a + b;
        int[] arr = new int[size];
        System.arraycopy(nums1, 0, arr, 0, a);
        System.arraycopy(nums2, 0, arr, a, b);
        Arrays.sort(arr);
        System.out.println("sorted array is :");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        int low = 0 ;
        int high = arr.length-1;
        double sum ;
            int mid = (low + high)/2;
            if(arr.length % 2 == 0){
                sum = arr[mid] + arr[mid+1];
                sum = sum / 2;
            } else{
                sum = arr[mid];
            }
        System.out.println( "\nMedian is :" + sum);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2,6};
        int[] nums2 = {3, 4};
        findMedianSortedArrays(nums1, nums2);
    }
}
