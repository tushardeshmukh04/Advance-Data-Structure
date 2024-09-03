package ArrayInJava.TwoDiamentionalArrays;

public class searchInSortedMatrix {
    public static boolean staircaseSearching(int[][] matrix, int key) {
        int row = 0;
        int col = matrix[0].length-1;
        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == key) {
                return true;
            }
            else if (key < matrix[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{10,20,30,40}, {15,25,35,45},{27,29,37,48}, {32,33,39,50}};
        if(staircaseSearching(matrix,33)) {
            System.out.println("Key is found");
        }
        else {
            System.out.println("Key not found");
        }
    }

}
