package Assignment_4_2D_Arrays_Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class P_9_Rowwise_sort_matrix {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        
        // Input matrix elements
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
            // Sort each row
            Arrays.sort(matrix[i]);
        }
        
        // Print the modified matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
