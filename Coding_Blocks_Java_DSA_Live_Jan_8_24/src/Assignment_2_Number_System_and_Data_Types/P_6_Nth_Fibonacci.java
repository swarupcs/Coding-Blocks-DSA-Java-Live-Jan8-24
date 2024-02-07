package Assignment_2_Number_System_and_Data_Types;

import java.util.Scanner;

public class P_6_Nth_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;
		for(int i=1; i<n; i++) {
			c = a+b;
			a = b;
			b = c;
		}
		System.out.println(c);

	}

}
