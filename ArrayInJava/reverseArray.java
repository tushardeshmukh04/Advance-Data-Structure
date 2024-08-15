package ArrayInJava;

public class reverseArray {
    public static void ReverseArray(int[] numbers){
        int first =0;
        int last = numbers.length - 1;
        while(first < last){
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;
            first++;
            last--;
        }
        for( int j : numbers) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8};
        ReverseArray(arr);
    }
}
