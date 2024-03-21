package Assignment_3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P_2_Arrays_Target_Sum_Triplets {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Size of array
        int[] array = new int[n]; // Array to store elements
        // Input elements of array
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int target = scanner.nextInt(); // Target number
        findTriplets(array, target); // Find triplets
    }

    // Function to find triplets with sum equal to target
    public static void findTriplets(int[] array, int target) {
        Arrays.sort(array); // Sort the array
        int n = array.length;

        // Iterate through each element as potential first element of triplet
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1; // Pointer to left element
            int right = n - 1; // Pointer to right element

            // Move pointers towards each other to find other two elements
            while (left < right) {
                int sum = array[i] + array[left] + array[right];
                if (sum == target) {
                    System.out.println(array[i] + ", " + array[left] + " and " + array[right]);
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

}
