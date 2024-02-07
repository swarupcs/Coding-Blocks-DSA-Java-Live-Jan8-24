package Assignment_2_Number_System_and_Data_Types;

import java.util.Scanner;

public class P_2_Count_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int inp_digit = sc.nextInt();
		int num = n;
		int count = 0;
		int each_digit = 0;
		
		while(num != 0) {
			each_digit = num % 10;
			if(each_digit == inp_digit) {
				count++;
			}
			num = num / 10;
		}
		System.out.println(count);

	}

}
