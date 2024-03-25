package Assignment_4_2D_Arrays_Binary_Search;

import java.util.Scanner;

public class P_13_Find_Square_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		System.out.println(SquareRoot(n));

	}

	public static long SquareRoot(long n) {
		// TODO Auto-generated method stub
		long low = 1;
		long high = n;
		while(low <= high) {
			long mid = (low+high)/2;
			long val = (mid * mid);
			if(val <= n) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
			
		}
		
		return high;
		
	}

}
