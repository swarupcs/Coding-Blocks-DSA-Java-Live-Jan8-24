package Assignment_3_Arrays;

import java.util.Scanner;

public class P_25_How_many_Questions {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of problems
        int solvedCount = 0;

        // Input the information about each problem and solve the problems
        for (int i = 0; i < n; i++) {
            int petya = scanner.nextInt();
            int vasya = scanner.nextInt();
            int tonya = scanner.nextInt();

            // Check if at least two friends are confident in solving the problem
            int confidentCount = petya + vasya + tonya;
            if (confidentCount >= 2) {
                solvedCount++;
            }
        }

        // Output the number of problems that will be solved
        System.out.println(solvedCount);
    }

}
