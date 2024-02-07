package Assignment_2_Number_System_and_Data_Types;

import java.util.Scanner;

public class P_Inverse_of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int place = 1;
		int mult = 1;
		int ans = 0;
		
		while(num != 0) {
			int rem = num % 10;
			ans = (int) (ans + place * Math.pow(10,  rem - 1));
			num = num / 10;
			place++;
		}
		
		System.out.println(ans);

	}

}

/*
1.Declare a Place variable that will keep track of the place number for which we are processing the work.
2.The value can be extracted by performing modulus operator on the given number.
3.In order to inverse the place and the number extracted in points 1 and 2 multiply the place with 10 ^ (rem - 1).
For e.g…, Place = 4 and rem = 3, then multiply place with 100 viz, ( 10 ^ (rem - 1)). 
4.Add the number to the previous ans.
 
 
 */
