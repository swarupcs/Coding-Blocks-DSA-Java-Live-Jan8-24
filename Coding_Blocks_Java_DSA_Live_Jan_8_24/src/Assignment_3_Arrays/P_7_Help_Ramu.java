package Assignment_3_Arrays;

import java.util.Scanner;

public class P_7_Help_Ramu {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int c1 = scanner.nextInt();
            int c2 = scanner.nextInt();
            int c3 = scanner.nextInt();
            int c4 = scanner.nextInt();

            int n = scanner.nextInt();
            int m = scanner.nextInt();

            int[] rickshawUsage = new int[n];
            int[] cabUsage = new int[m];

            // Input rickshaw usage
            for (int i = 0; i < n; i++) {
                rickshawUsage[i] = scanner.nextInt();
            }

            // Input cab usage
            for (int i = 0; i < m; i++) {
                cabUsage[i] = scanner.nextInt();
            }

            long totalRickshawCost = getTotalCost(rickshawUsage, c1, c2, c3);
            long totalCabCost = getTotalCost(cabUsage, c1, c2, c3);

            long finalCost = Math.min(totalRickshawCost + totalCabCost, c4);
            System.out.println(finalCost);
        }
    }

    public static long getTotalCost(int[] usage, int c1, int c2, int c3) {
        long totalCost = 0;

        for (int u : usage) {
            totalCost += Math.min(u * c1, c2);
        }

        return Math.min(totalCost, c3);
    }

}
