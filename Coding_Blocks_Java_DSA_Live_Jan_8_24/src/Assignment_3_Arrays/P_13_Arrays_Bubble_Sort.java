package Assignment_3_Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class P_13_Arrays_Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Bubble_Sort(arr);
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void Bubble_Sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
