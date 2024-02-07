package Lec_7;

import java.util.Scanner;

public class Pattern_23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int nsp = n-1;
		int nst = 1;
		
		while(row <= n) {
			//Print the Space
			int i = 1;
			while(i<=nsp) {
				System.out.print(" "+"\t");
				i = i+1;
			}
			
			//Print the Star
			int j = 1;
			while(j<=nst) {
				System.out.print("1"+"\t");
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


/*
 
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nsp = 1;
		int nst = 1;
		while(row<=n) {
			int i = 1;
			while(i<=n-row) {
				System.out.print(" ");
				i = i+1;
			}
			int j = 1;
			while(j<=row*2-1) {
				System.out.print("1");
				j = j+1;
			}
			row = row+1;
			System.out.println();
		}

	}
  */
