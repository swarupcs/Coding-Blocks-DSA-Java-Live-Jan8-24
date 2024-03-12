package Assignment_3_Arrays;

import java.util.Scanner;

public class P_11_Sort_just_Zeroes_and_Ones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Sort_0_1(arr);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void Sort_0_1(int[] arr) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = arr.length - 1;
		int temp;
		while(start < end) {
			if(arr[start] == 1) {
				temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				end--;
			} else {
				start++;
			}
		}
	}

}
