package Assignment_1_Pattern;
import java.util.*;

public class P_4_Pattern_Number_Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(k+"\t");
				k=k+1;
			}
			System.out.println();
		}

	}

}
