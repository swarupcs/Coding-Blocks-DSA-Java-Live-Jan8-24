package Assignment_3_Arrays;

import java.util.Scanner;

public class P_9_Arrays_Reverse_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Reverse_Array(arr,0,n-1);
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
			

	}
	
	public static void Reverse_Array(int[] arr, int left, int right) {
		while(left<right) {
			int temp = arr[left];
			arr[left] = arr[right]; 
			arr[right] = temp;
			left++;
			right--;
		}
	}

}
