package Assignment_2_Number_System_and_Data_Types;

import java.util.Scanner;

public class P_10_GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		int gcd = 1;

		for (int i = 1; i <= n1 && i <= n2; ++i) {

			if (n1 % i == 0 && n2 % i == 0)
				gcd = i;
		}
		
		System.out.println(gcd);

	}

}
