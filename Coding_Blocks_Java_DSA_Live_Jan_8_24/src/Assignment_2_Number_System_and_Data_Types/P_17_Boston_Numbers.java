package Assignment_2_Number_System_and_Data_Types;

import java.util.Scanner;

public class P_17_Boston_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

	}
	
	public static int Is_Boston_Numbers(int n) {
		int digit = sumOfdigit(n);
	}
	
	public static int sumOfdigit(int num) {
		int sum = 0;
		while(num != 0) {
			int rem = num % 10;
			sum += rem;
			num = num/10;
		}
		return sum;
	}

}
