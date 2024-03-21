package Assignment_3_Arrays;

import java.util.Scanner;

public class P_17_Maximum_Circular_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // no. of test cases
		while (t-- > 0) {
			int n = sc.nextInt(); // size of array
			int[] arr = new int[n]; // array;
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			if (n == 1) {
				System.out.println(arr[0]);
			}
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum = sum + arr[i];
			}
			int curr_max = arr[0];
			int max_so_far = arr[0];
			int curr_min = arr[0];
			int min_so_far = arr[0];
			for (int i = 1; i < n; i++) {
				curr_max = Math.max(curr_max + arr[i], arr[i]);
				max_so_far = Math.max(curr_max, max_so_far);

				curr_min = Math.min(curr_min + arr[i], arr[i]);
				min_so_far = Math.min(curr_min, min_so_far);
			}
			if (min_so_far == sum) {
				System.out.println(min_so_far);
			}

			System.out.println(Math.max(max_so_far, sum - min_so_far));
		}
	}

}
