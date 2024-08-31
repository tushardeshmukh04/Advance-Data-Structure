package ArrayInJava.TwoDiamentionalArrays;

public class spiralMatrix {
    public static void printSpiralMatrix(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        int startRow = 0;
        int startCol = 0;
        int endRow = row-1;
        int endCol = col-1;
        while(startRow <= endRow && startCol <= endCol) {
            //top
            for(int j=startCol; j<=endCol;j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            //right
            for(int i=startRow+1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            //bottom
            for(int j=endCol-1; j >= startCol; j--) {
                if(startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            //left
            for(int i=endRow-1; i >= startRow+1; i--) {
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            System.out.println();
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4}, {5,6,7,8},{9,10,11,12}, {13,14,15,16}};
        printSpiralMatrix(matrix);
    }
}
