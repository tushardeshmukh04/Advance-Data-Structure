package ArrayInJava.Searching;

public class binarySearch {
    public static int binarySearching(int[] arr, int key){
        int low =0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == key){
                return mid;
            } else if(key > arr[mid]){
                low = mid + 1;
            } else high = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int key = 7;
        int result = binarySearching(arr, key);
        if( result == -1){
            System.out.println("Key not found");
        } else {
            System.out.println("Key is found at index: "+ result);
        }
    }
}
