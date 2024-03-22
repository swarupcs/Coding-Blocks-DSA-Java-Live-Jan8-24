package Assignment_4_2D_Arrays_Binary_Search;

import java.util.Scanner;

public class P_3_Arrays_Wave_print_Column_Wise {

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
		WavePrintCol(arr);

	}

	public static void WavePrintCol(int[][] arr) {
	    // TODO Auto-generated method stub
	    int rows = arr.length;
	    int cols = arr[0].length;
	    
	    for (int i = 0; i < cols; i++) {
	        if (i % 2 == 0) {
	            for (int j = 0; j < rows; j++) {
	                System.out.print(arr[j][i] + ", ");
	            }
	        } else {
	            for (int j = rows - 1; j >= 0; j--) {
	                System.out.print(arr[j][i] + ", ");
	            }
	        }
	    }
	    System.out.print("END");
	}

}
