package Assignment_4_2D_Arrays_Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class P_14_Aggressive_Cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// number of stall
		int c = sc.nextInt();// number of cows
		int[] stall = new int[n];
		for (int i = 0; i < stall.length; i++) {
			stall[i] = sc.nextInt();
		}
		Arrays.sort(stall);// sort
		System.out.println(largest_Distance(stall, c));

	}

	public static int largest_Distance(int[] stall, int c) {
		int n = stall.length;
		int lo = 0;
		int hi = stall[n - 1] - stall[0];
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitpossible(stall, c, mid) == true) {
				ans = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return ans;

	}

	public static boolean isitpossible(int[] stall, int c, int mid) {
		int cow = 1;
		int pos = stall[0];
		for (int i = 1; i < stall.length; i++) {
			if (stall[i] - pos >= mid) {
				cow++;
				pos = stall[i];
			}
			if (cow == c) {
				return true;
			}
		}
		return false;
	}

}
