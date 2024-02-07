package Assignment_2_Number_System_and_Data_Types;

import java.util.Scanner;

public class P_3_Print_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
		int rev = 0;
		
		while(n != 0) {
			num = n % 10;
			rev = rev * 10 + num;
			n = n / 10;
		}
		
		System.out.println(rev);

	}

}
