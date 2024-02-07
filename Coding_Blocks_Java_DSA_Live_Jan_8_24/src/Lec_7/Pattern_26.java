package Lec_7;
import java.util.*;

public class Pattern_26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int nsp = n-1;
		int nst = 1;
		int row_val = 1;
		
		while(row <= n) {
			//Print the Space
			int i = 1;
			while(i<=nsp) {
				System.out.print(" "+"\t");
				i = i+1;
			}
			
			//Print the Star
			int j = 1;
			int col_val = row_val;
			while(j<=nst) {
				System.out.print(col_val+"\t");
				col_val=col_val+1;
				j = j+1;
			}
			//Preparation for next Row
			nsp = nsp-1;
			nst = nst+2;
			System.out.println();
			row = row+1;
		}
		


	}


}
