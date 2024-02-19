package Assignment_3_Arrays;

import java.util.Scanner;

public class P_3_Arrays_Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int item = sc.nextInt();
		System.out.println(Linear_Search(arr,item));
		

	}
	
	public static int Linear_Search(int[] arr, int item) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == item) {
				return i;
			}
		}
		return -1;
	}

}
