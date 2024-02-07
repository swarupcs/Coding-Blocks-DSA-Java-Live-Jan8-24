package Assignment_2_Number_System_and_Data_Types;

import java.util.Scanner;

public class P_4_Binary_To_Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);    
		int binary = sc.nextInt();
		int decimal = 0;	
		int n = 0;  
		while(binary != 0)
		{
			int temp = binary%10; 
			decimal += temp*Math.pow(2, n);  
			binary = binary/10;  
			n++;  
		}
		System.out.println(decimal); 

	}

}
