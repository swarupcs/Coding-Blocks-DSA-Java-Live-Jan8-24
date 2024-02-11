package Assignment_2_Number_System_and_Data_Types;

import java.util.Scanner;

public class P_17_Boston_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Is_Boston_Numbers(n));

	}
	
	public static int Is_Boston_Numbers(int n) {
		int digit = sumOfdigit(n);
		int primeFactor = 0;
		int div = 2;
		while(div <= n) {
			int rem = n%div;
			if(rem == 0) {
				primeFactor = primeFactor + sumOfdigit(div);
				n = n / div;				
			} else {
				div++;
			}
		}
		
		if(primeFactor == digit) {
			return 1;
		} else {
			return 0;
		}
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
