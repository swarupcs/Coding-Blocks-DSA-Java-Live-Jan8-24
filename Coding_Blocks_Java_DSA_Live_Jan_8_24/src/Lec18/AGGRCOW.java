package Lec18;

import java.util.Arrays;
import java.util.Scanner;

public class AGGRCOW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();// number of stall
			int c = sc.nextInt();// number of cows
			int[] stall = new int[n];
			for (int i = 0; i < stall.length; i++) {
				stall[i] = sc.nextInt();
			}
			Arrays.sort(stall);// sort
			System.out.println(largest_Distance(stall, c));
			t--;
		}

	}

	
	public static int largest_Distance(int[] stall, int c) {
		int n = stall.length;
		int low = 0;
		int high = stall[n-1] - stall[0];
		int ans = 0;
		while(low <= high) {
			int mid = (low+high)/2;
			if(isItPossible(stall, c, mid) == true) {
				ans = mid;
				low = mid+1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
	}

	public static boolean isItPossible(int[] stall, int c, int mid) {
		// TODO Auto-generated method stub
		int cow = 1;
		int pos = stall[0];
		for(int i=1; i<stall.length; i++) {
			if(stall[i] - pos >= mid) {
				cow++;
				pos = stall[i];
			}
			if(cow == c) {
				return true;
			}
		}
		return false;
	}

}
