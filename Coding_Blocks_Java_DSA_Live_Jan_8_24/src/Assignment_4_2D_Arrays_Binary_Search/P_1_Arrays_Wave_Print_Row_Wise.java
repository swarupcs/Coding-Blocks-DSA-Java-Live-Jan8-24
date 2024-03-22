package Assignment_4_2D_Arrays_Binary_Search;

import java.util.Scanner;

public class P_1_Arrays_Wave_Print_Row_Wise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		WavePrintRow(arr);

	}

	public static void WavePrintRow(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i = 0; i<arr.length; i++) {
			if(i%2 == 0) {
				for(int j=0; j<arr[0].length; j++) {
					System.out.print(arr[i][j] + ", ");
				}
			} else {
				for(int j=arr[0].length - 1; j>=0; j--) {
					System.out.print(arr[i][j] + ", ");
				}
			}
		}
		System.out.print("END");
		
	}

}
