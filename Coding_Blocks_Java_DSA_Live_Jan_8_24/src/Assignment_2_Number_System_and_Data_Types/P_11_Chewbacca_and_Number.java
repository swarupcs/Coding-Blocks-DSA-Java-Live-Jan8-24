package Assignment_2_Number_System_and_Data_Types;

import java.util.Scanner;

public class P_11_Chewbacca_and_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = num;
		int n2 = num;
		int number = 0;
		int i = 0;
		int min = 99;
		while(n != 0) {
			int rem = n%10;
			if(rem < min) {
				min = rem;
			}
//			number = (int) (number + rem * Math.pow(10,i));
//			i++;
			
//			System.out.println(min);
			n = n/10;
		}
		
		while(n2 != 0) {
			number = (int) (number + min * Math.pow(10,i));
			i++;
			
//			System.out.println(min);
			n2 = n2/10;
		}
//		System.out.println(min);
		System.out.println(number);

	}

}
