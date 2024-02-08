package Assignment_2_Number_System_and_Data_Types;

import java.util.Scanner;

public class P_15_Print_Armstrong_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int low = sc.nextInt();
		int high = sc.nextInt();
		
		for(int i=low; i<=high; i++) {
			int num = i;
			int n = i;
			int number = i;
			int count = 0;
			int sum = 0;
			int rem = 0;
//			System.out.println(num);
			while(n != 0) {
				n = n/10;
				count++;
			}
			while(num != 0) {
				rem = num % 10;
				sum = (int) (sum + Math.pow(rem, count));
				num = num / 10;
			}
			if(sum == number) {
				System.out.println(number);
			}
		}

	}

}
