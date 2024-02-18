package Assignment_3_Arrays;

import java.util.Scanner;

public class P_16_Arrays_Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Insertion_Sort(arr);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}
	
	public static void Insertion_Sort(int [] arr) {
		for(int i=1; i<arr.length; i++) {
			InsertLastElement(arr, i);
		}
	}
	
	
	public static void InsertLastElement(int[] arr, int i) {
		int item = arr[i];
		int j = i - 1;
		while (j >= 0 && arr[j] > item) {
			arr[j + 1] = arr[j];
			arr[j] = item;
			j--;
		}


	}
 

}
