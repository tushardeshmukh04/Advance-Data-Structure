package Recursion;

public class ToFindLastoccurence {
    public static int lastOccurenceOfElement(int[] arr, int key,int i){
        if(i == arr.length - 1){
            return-1;
        }
        int isFound = lastOccurenceOfElement(arr, key, i+1);
        if(isFound == -1 && key == arr[i]){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int[] arr = {8,3,6,9,5,10,2,5,7};
        int key = 5;
        System.out.println(lastOccurenceOfElement(arr,key,0));
    }
}
