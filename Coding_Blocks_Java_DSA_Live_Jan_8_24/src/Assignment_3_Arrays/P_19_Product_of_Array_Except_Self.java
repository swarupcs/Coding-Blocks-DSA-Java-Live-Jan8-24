package Assignment_3_Arrays;

import java.util.Scanner;

public class P_19_Product_of_Array_Except_Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		long[] ans = Product_Array(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	public static long[] Product_Array(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		long[] left = new long[n];
		left[0] = 1;
		for(int i=1; i<n; i++) {
			left[i] = left[i-1] * arr[i-1];
		}
		long[] right = new long[n];
		right[n-1] = 1;
		for(int i=n-2; i>=0; i--) {
			right[i] = right[i+1] * arr[i+1];
		}
		
		for(int i=0; i<n; i++) {
			left[i] = left[i] * right[i];
		}
		
		return left;
		
	}

}
