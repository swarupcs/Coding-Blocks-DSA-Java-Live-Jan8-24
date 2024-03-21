package Assignment_3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P_8_Alex_Goes_Shopping {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Number of items in the shop
            int[] prices = new int[n];

            // Input prices of items
            for (int j = 0; j < n; j++) {
                prices[j] = scanner.nextInt();
            }

            Arrays.sort(prices); // Sort the prices to facilitate counting distinct prices

            int q = scanner.nextInt(); // Number of queries
            for (int j = 0; j < q; j++) {
                int A = scanner.nextInt(); // Alex's money
                int k = scanner.nextInt(); // Shopkeeper's claim of having at least 'k' items

                // Check if there are at least 'k' distinct prices that Alex can afford
                int distinctCount = countDistinctPrices(prices, A);

                // Check if the shopkeeper's claim is correct
                if (distinctCount >= k) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
            if (i < t - 1) {
                System.out.println(); // Print a blank line after each test case
            }
        }
    }

    public static int countDistinctPrices(int[] prices, int A) {
        int distinctCount = 0;
        int prevPrice = -1;
        for (int price : prices) {
            if (price <= A && price != prevPrice) {
                distinctCount++;
                prevPrice = price;
            }
        }
        return distinctCount;
    }

}
