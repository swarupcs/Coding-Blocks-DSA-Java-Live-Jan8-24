package Assignment_2_Number_System_and_Data_Types;

import java.util.Scanner;

public class P_5_LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int lcm = 0;

		int max = (num1 > num2) ? num1 : num2;
		for (int i = max; i <= num1 * num2; i++) {
			if (i % num1 == 0 && i % num2 == 0) {
				lcm = i;
				break;
			}
		}
		System.out.println(lcm);

	}

}
