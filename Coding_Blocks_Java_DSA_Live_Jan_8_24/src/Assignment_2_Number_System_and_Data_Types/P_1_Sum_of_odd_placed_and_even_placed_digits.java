package Assignment_2_Number_System_and_Data_Types;

import java.util.Scanner;

public class P_1_Sum_of_odd_placed_and_even_placed_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = n;
		int pos = 1;
		int each_num = 0;
		int odd_sum = 0;
		int even_sum = 0;
		while(num != 0) {
			each_num = num % 10;
			if(pos % 2 == 0) {
				even_sum += each_num;
			}
			else {
				odd_sum += each_num;
			}
			pos = pos + 1;
			
//			System.out.println(each_num);
			num = num / 10;
		}
		System.out.println(odd_sum);
		System.out.println(even_sum);

	}

}
