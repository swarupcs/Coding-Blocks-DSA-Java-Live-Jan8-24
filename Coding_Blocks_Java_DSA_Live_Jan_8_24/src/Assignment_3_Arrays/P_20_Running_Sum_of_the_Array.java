package Assignment_3_Arrays;

import java.util.Scanner;

public class P_20_Running_Sum_of_the_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] ans = Sum_Array(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	public static int[] Sum_Array(int[] arr) {
		// TODO Auto-generated method stub
		
		int[] ans = new int[arr.length]; 
		ans[0] = arr[0];
		for(int i=1; i<arr.length; i++) {
			ans[i] = arr[i] + ans[i-1];
		}
		return ans;
	}

}
