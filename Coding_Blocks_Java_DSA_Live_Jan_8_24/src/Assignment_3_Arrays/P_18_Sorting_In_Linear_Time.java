package Assignment_3_Arrays;

import java.util.Scanner;

public class P_18_Sorting_In_Linear_Time {

	public class Main {
	    public static void main(String args[]) {
	        Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++)
	            arr[i] = scn.nextInt();
	        sortColors(arr);
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println(arr[i]);
	        }
	    }

	    public static void sortColors(int[] nums) {
	        int low = 0, mid = 0, high = nums.length - 1;
	        while (mid <= high) {
	            if (nums[mid] == 0) {
	                swap(nums, low, mid);
	                low++;
	                mid++;
	            } else if (nums[mid] == 1) {
	                mid++;
	            } else {
	                swap(nums, mid, high);
	                high--;
	            }
	        }
	    }

	    public static void swap(int[] nums, int i, int j) {
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	    }

}
