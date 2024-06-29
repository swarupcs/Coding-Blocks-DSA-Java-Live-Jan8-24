package Lec56;

import java.util.*;

public class Edit_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "FOOD";
		String t = "MONEY";
		int[][] dp = new int[s.length()][t.length()];
		for (int[] a : dp) {
			Arrays.fill(a, -1);

		}
		System.out.println(Min_Ops(s, t, 0, 0, dp));
		System.out.println(Min_OpsBu(s, t));
	}

	public static int Min_Ops(String s, String t, int i, int j, int[][] dp) {
		if (i == s.length()) {
			return t.length() - j;
		}
		if (j == t.length()) {
			return s.length() - i;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = 0;
		if (s.charAt(i) == t.charAt(j)) {
			ans = Min_Ops(s, t, i + 1, j + 1, dp);// dp[i-1][j-1]
		} else {
			int D = Min_Ops(s, t, i + 1, j, dp);// dp[i-1][j]
			int I = Min_Ops(s, t, i, j + 1, dp);// dp[i][j-1]
			int R = Min_Ops(s, t, i + 1, j + 1, dp);// dp[i-1][j-1]
			ans = Math.min(I, Math.min(D, R)) + 1;
		}
		return dp[i][j] = ans;

	}

	public static int Min_OpsBu(String s, String t) {
		int[][] dp = new int[s.length() + 1][t.length() + 1];
		for (int i = 1; i < dp[0].length; i++) {
			dp[0][i] = i;
		}
		for (int i = 1; i < dp.length; i++) {
			dp[i][0] = i;
		}
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				int ans = 0;
				if (s.charAt(i - 1) == t.charAt(j - 1)) {
					ans = dp[i - 1][j - 1];
				} else {
					int D = dp[i - 1][j];
					int I = dp[i][j - 1];
					int R = dp[i - 1][j - 1];
					ans = Math.min(I, Math.min(D, R)) + 1;
				}
				dp[i][j] = ans;
			}
		}
		return dp[dp.length - 1][dp[0].length - 1];

	}

}
