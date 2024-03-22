package Assignment_4_2D_Arrays_Binary_Search;

import java.util.Scanner;

public class P_19_Print_Upper_Triangular_Matrix {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		UpperTraingular(arr);

	}

	public static void UpperTraingular(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(i > j) {
					System.out.print("0" + " ");
				} else {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
		
		
	}

}
