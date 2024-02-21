package Assignment_3_Arrays;

import java.util.Scanner;

public class P_5_Arrays_Max_Value_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Max_Array(arr));

	}

	public static int Max_Array(int[] arr) {
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		
		return max;
		
	}

}
