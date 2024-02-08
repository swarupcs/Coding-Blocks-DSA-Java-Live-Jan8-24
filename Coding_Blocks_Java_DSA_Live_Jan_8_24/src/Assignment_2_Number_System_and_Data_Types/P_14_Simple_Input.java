package Assignment_2_Number_System_and_Data_Types;

import java.util.Scanner;

public class P_14_Simple_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		while(true) {
			num = sc.nextInt();
			sum = sum + num;
			if(sum < 0) {
//				System.out.println("Exit after break");
				break;
				
			}
			System.out.println(num);
//			System.out.println("print num");
			
		}

	}

}
