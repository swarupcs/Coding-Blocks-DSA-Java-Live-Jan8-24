package Assignment_3_Arrays;

import java.util.Scanner;

public class P_22_Rain_Water_Trapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testCaseNumber = sc.nextInt();
		for(int j=0; j<testCaseNumber; j++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(Maximum_Water(arr));;
		}
		

	}
	
	public static int Maximum_Water(int[] arr) {
		int n = arr.length;
		//left max
		int[] left = new int[n];
		left[0] = arr[0];
		for(int i=1; i<n; i++) {
			left[i] = Math.max(left[i-1], arr[i]);
		}
		
		//right max
		int[] right = new int[n];
		right[n-1] = arr[n-1];
		for(int i=n-2; i>=0; i--) {
			right[i] = Math.max(right[i+1], arr[i]);
		}
		
		//Calculate the ans
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum = sum + Math.min(left[i], right[i]) - arr[i];
		}
		
		return sum;
	}

}
