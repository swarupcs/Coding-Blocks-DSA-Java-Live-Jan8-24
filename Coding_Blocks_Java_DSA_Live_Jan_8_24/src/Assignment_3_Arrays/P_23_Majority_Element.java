package Assignment_3_Arrays;

import java.util.Scanner;

public class P_23_Majority_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int ans = Majority_Element(arr);
		System.out.println(ans);

	}

	public static int Majority_Element(int[] arr) {
		// TODO Auto-generated method stub
		int element = 0;
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(count == 0) {
				element = arr[i];
				count = 1;
			} else if(element == arr[i]) {
				count++;
			} else {
				count--;
			}
		}
		int countElement = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == element) {
				countElement++;
			}
		}
		if(countElement > (arr.length/2)) {
			return element;
		}
		return -1;
	}

}
