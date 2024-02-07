package Assignment_2_Number_System_and_Data_Types;

import java.util.Scanner;

public class P_9_Check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n == 1) {
			System.out.println("Not Prime");
			return;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println("Not Prime");
				return;
			}
		}

		System.out.println("Prime");

	}

}
