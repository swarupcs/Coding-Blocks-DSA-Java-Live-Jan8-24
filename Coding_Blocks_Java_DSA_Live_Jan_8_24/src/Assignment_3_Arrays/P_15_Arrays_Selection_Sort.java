package Assignment_3_Arrays;

import java.util.Scanner;

public class P_15_Arrays_Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Selection_Sort(arr);
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

	}
	
	public static void Selection_Sort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int idx = minidx(arr, i);
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
		}
	}
	
	public static int minidx(int[] arr, int index) {
		int idx = index;
		for(int i=index+1; i<arr.length; i++) {
			if(arr[i] < arr[idx]) {
				idx = i;
			}
		}
		return idx;
	}

}
