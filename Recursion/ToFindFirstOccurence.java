package Recursion;

public class ToFindFirstOccurence {
    public static int firstOccurenceOfElement(int[] arr, int key,int i){
        if(i == arr.length - 1){
            return-1;
        }
        if(key == arr[i]){
                return i;
        }
        return firstOccurenceOfElement(arr, key, i+1);
    }
    public static void main(String[] args) {
        int[] arr = {8,3,6,9,5,10,2,5,7};
        int key = 1;
        System.out.println(firstOccurenceOfElement(arr,key,0));


    }
}
