package Assignment_4_2D_Arrays_Binary_Search;

import java.util.Scanner;

public class P_4_Matrix_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
	       int n = scn.nextInt();
	       int[][] arr=new int[m][n];
	       for (int i=0; i<m; i++){
	              for(int j=0; j<n; j++){
	                    arr[i][j]=scn.nextInt();
	               }
	        }
	        int k = scn.nextInt();
	        System.out.print(searchMatrix(arr, k));

	}
	public static int searchMatrix(int[][] matrix, int target) {
    	int row = 0;
    	int col = matrix[0].length-1;
    	
    	while(row<matrix.length && col >=0) {
    			if(matrix[row][col] == target) {
    				return 1;
    			} else if (matrix[row][col] > target) {
					col--;
				} else {
					row++;
				}
    		}

		return 0;

    }

}
