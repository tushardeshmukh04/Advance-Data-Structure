package ArrayInJava.TwoDiamentionalArrays;

import java.util.*;

import static java.lang.System.exit;


public class basicOperations {
    public static void printArray(int[][] matrix) {
        for(int i=0; i< matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void search(int[][] matrix, int key) {
        int flag = 0;
        for(int i=0; i< matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                   flag = 1;
                    System.out.print("key is found in cell (" + i +"," + j +")");
                   break;
                }
            }
        }
        if(flag == 0) {
            System.out.println("key  not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int row = matrix.length;
        int col = matrix[0].length;
        System.out.println("Enter the elements in array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int ch;
        do {
            System.out.println();
            System.out.println("--------MENU---------");
            System.out.println("1.printArray");
            System.out.println("2.SearchKey");
            System.out.println("3.exit");
            System.out.println();
            System.out.print("Enter the choice: ");
            int choice =sc.nextInt();
            switch (choice) {
                case 1:
                    printArray(matrix);
                    break;
                case 2:
                    search(matrix, 5);
                    break;
                case 3 :
                    exit(0);
                default:
                    System.out.println("Invalid choice, please try again.");
            }
            System.out.println("Do you want to continue (1/0): ");
            ch = sc.nextInt();
        } while (ch != 0);
    }
}
