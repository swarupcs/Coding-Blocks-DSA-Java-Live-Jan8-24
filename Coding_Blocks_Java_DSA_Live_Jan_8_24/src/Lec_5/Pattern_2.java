package Lec_5;

import java.util.*;

public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int row = 1;
		int nst = n;
		while(row <= n) {
			
			int i = 1;
			while(i <= nst) {
				System.out.print("* ");
				i = i+1;
			}
			
			nst = nst - 1;
			System.out.println();
			row = row + 1;
		}
		

	}

}
