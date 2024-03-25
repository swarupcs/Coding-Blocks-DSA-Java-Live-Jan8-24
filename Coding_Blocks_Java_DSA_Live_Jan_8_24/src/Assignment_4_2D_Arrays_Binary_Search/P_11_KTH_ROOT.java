package Assignment_4_2D_Arrays_Binary_Search;

import java.util.Scanner;

public class P_11_KTH_ROOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			long n = sc.nextLong();
			int k = sc.nextInt();
			System.out.println(root(n, k));
		}

	}

	public static long root(long n, int k) {
		long lo = 0;
		long hi = n;
		long ans = 0;
		while (lo <= hi) {
			long mid = (lo + hi) / 2;
			if (Math.pow(mid, k) <= n) {
				ans = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return ans;
	}

}
