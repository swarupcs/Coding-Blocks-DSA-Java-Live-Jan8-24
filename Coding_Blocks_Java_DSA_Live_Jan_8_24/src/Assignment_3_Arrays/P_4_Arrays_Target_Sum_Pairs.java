package Assignment_3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P_4_Arrays_Target_Sum_Pairs {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Size of array
        int[] array = new int[n]; // Array to store elements
        // Input elements of array
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int target = scanner.nextInt(); // Target number
        findPairs(array, target); // Find pairs
    }

    // Function to find pairs with sum equal to target
    public static void findPairs(int[] array, int target) {
        Arrays.sort(array); // Sort the array
        int left = 0; // Pointer to left element
        int right = array.length - 1; // Pointer to right element

        // Iterate through array to find pairs
        while (left < right) {
            int sum = array[left] + array[right];
            if (sum == target) {
                System.out.println(array[left] + " and " + array[right]);
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }

}
