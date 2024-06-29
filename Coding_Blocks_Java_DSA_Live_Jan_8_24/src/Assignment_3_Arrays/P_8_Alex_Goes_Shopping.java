package Assignment_3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P_8_Alex_Goes_Shopping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] price = new int[n];
		for (int i = 0; i < price.length; i++) {
			price[i] = sc.nextInt();
		}

		int q = sc.nextInt();
		while (q-- != 0) {
			int money = sc.nextInt();
			int k = sc.nextInt();
			ags(price, money, k);
		}
	}

	public static void ags(int[] price, int money, int k) {
		// TODO Auto-generated method stub
		int choice = 0;
		for (int i = 0; i < price.length; i++) {
			if (money % price[i] == 0) {
				choice++;
			}
		}

		if (choice >= k) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
