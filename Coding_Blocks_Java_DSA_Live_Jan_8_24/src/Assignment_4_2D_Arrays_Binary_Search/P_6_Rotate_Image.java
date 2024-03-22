package Assignment_4_2D_Arrays_Binary_Search;

import java.util.Scanner;

public class P_6_Rotate_Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		Rotate(arr);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void Rotate(int[][] arr) {
		Reverse(arr);
		TransposeMatrix(arr);
	}
	
	public static void Reverse(int[][] arr) {
	    int n = arr.length;
	    int m = arr[0].length; // Assuming the matrix is square
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < m / 2; j++) { // Iterate only over half of the columns
	            int temp = arr[i][j];
	            arr[i][j] = arr[i][m - j - 1];
	            arr[i][m - j - 1] = temp;
	        }
	    }
	}
	
	public static void TransposeMatrix(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr[0].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
	}



}
