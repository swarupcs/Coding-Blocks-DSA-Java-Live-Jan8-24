package Assignment_4_2D_Arrays_Binary_Search;

import java.util.Scanner;

public class P_18_A_Boolean_Matrix {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(); // Number of rows
        int n = scanner.nextInt(); // Number of columns
        int[][] mat = new int[m][n];

        // Input matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        modifyMatrix(mat, m, n);

        // Print modified matrix
        printMatrix(mat, m, n);
    }

    // Function to mark rows and columns with 1s and update the matrix
    public static void modifyMatrix(int[][] mat, int m, int n) {
        boolean[] rowsWithOnes = new boolean[m];
        boolean[] colsWithOnes = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    rowsWithOnes[i] = true;
                    colsWithOnes[j] = true;
                }
            }
        }

        // Update matrix based on marked rows and columns
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rowsWithOnes[i] || colsWithOnes[j]) {
                    mat[i][j] = 1;
                }
            }
        }
    }

    // Function to print the matrix
    public static void printMatrix(int[][] mat, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

}
