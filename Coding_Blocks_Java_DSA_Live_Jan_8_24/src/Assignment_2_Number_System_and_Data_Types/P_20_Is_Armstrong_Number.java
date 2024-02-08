package Assignment_2_Number_System_and_Data_Types;

import java.util.Scanner;

public class P_20_Is_Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		int n = num;
		int number = num;
		int rem = 0;
		int sum = 0;
		while(n != 0) {
			n = n/10;
			count++;
		}
		while(num != 0) {
			rem = num%10;
			sum = (int) (sum + Math.pow(rem, count));
			num = num/10;
		}
		if(sum == number) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
