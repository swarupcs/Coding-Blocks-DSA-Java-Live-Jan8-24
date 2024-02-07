package Assignment_2_Number_System_and_Data_Types;

import java.util.Scanner;

public class P_13_Print_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int count = 0;
		int i = 1;
		while(count<n1) {
			int term = 3*i+2;
			i++;
			if(term % n2 != 0) {
				System.out.println(term);
				count++;
			}
			
		}

	}

}
