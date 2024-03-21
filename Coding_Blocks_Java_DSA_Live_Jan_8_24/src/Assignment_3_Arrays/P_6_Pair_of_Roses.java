package Assignment_3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P_6_Pair_of_Roses {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); // Number of available roses
            int[] prices = new int[N];

            // Input prices of roses
            for (int i = 0; i < N; i++) {
                prices[i] = scanner.nextInt();
            }

            int M = scanner.nextInt(); // Money Deepak has
            findRoses(prices, M);
            if (t != T - 1) {
                System.out.println(); // Print newline after each test case except the last one
            }
        }
    }

    public static void findRoses(int[] prices, int M) {
        Arrays.sort(prices);

        int i = 0, j = prices.length - 1;

        // Initialize variables to store the final pair of roses
        int rose1 = -1, rose2 = -1;

        // Iterate through the sorted array to find the pair of roses with the desired sum
        while (i < j) {
            int sum = prices[i] + prices[j];
            if (sum == M) {
                rose1 = prices[i];
                rose2 = prices[j];
                i++;
                j--;
            } else if (sum < M) {
                i++;
            } else {
                j--;
            }
        }

        // Output the pair of roses
        System.out.println("Deepak should buy roses whose prices are " + rose1 + " and " + rose2 + ".");
    }

}
