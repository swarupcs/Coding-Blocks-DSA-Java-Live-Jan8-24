package Assignment_2_Number_System_and_Data_Types;

import java.util.Scanner;

public class P_12_Replace_Them_All {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long num = sc.nextInt();
		long each_digit = 0;
		long number = 0;
		long ans = 0;
		long i = 0;
		
		while(num != 0) {
			each_digit = num % 10;
			if(each_digit == 0) {
				each_digit = 5;
			}
			ans = (long) (ans + each_digit * Math.pow(10, i));
			i++;
			num = num / 10;
		}
		
		System.out.println(ans);

	}

}
