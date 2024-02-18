package Assignment_3_Arrays;

import java.util.Scanner;

public class P_10_Squares_of_a_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Square_Array(arr);
		Sort_Array(arr);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void Square_Array(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr[i] * arr[i];
		}
	}
	public static void Sort_Array(int[] arr) {
		for(int i = 1; i<arr.length; i++) {
			for(int j=0; j<arr.length-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}
