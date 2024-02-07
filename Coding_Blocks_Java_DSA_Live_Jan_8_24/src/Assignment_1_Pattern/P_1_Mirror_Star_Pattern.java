package Assignment_1_Pattern;
import java.util.*;

public class P_1_Mirror_Star_Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }

            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*  ");
            }

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }

            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*  ");
            }

            System.out.println();
        }
	}

}
