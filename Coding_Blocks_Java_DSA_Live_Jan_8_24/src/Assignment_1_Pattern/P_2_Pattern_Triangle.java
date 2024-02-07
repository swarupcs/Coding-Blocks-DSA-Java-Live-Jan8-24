package Assignment_1_Pattern;
import java.util.*;

public class P_2_Pattern_Triangle {


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
				
				if(j<(nst+1)/2) {
					col_val=col_val+1;					
				} else {
					col_val=col_val-1;
				}
				j = j+1;
			}
			//Preparation for next Row
			nsp = nsp-1;
			nst = nst+2;
			row_val = row_val+1;
			System.out.println();
			row = row+1;
		}
		


	}

}
