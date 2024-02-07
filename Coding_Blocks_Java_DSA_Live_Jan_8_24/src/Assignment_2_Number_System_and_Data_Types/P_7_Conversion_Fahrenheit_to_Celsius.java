package Assignment_2_Number_System_and_Data_Types;

import java.util.Scanner;

public class P_7_Conversion_Fahrenheit_to_Celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		int step = sc.nextInt();
		
		for(int fahrenheit = min; fahrenheit<=max; fahrenheit += step) {
			int celsius = ((fahrenheit-32)*5)/9;
			System.out.println(fahrenheit + "\t" +celsius);
		}

	}

}
