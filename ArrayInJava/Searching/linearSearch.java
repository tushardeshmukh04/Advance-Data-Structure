package ArrayInJava.Searching;

public class linearSearch {
    public static int search(int[] arr, int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int key = 5;
        int result = search(arr, key);
        if(result == -1){
            System.out.println("Key not found");
        } else System.out.println("Key is found at index: " + result);
    }
}
