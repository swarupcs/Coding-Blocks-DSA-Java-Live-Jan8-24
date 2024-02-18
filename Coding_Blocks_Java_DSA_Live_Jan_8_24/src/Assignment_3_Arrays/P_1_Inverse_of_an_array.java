package Assignment_3_Arrays;

import java.util.Scanner;

public class P_1_Inverse_of_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Inverse_Array(arr);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}
	
	public static void Inverse_Array(int[] arr) {
		int[] invertedArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            invertedArray[arr[i]] = i;
        }

        // Copy the inverted array back to the original array
        System.arraycopy(invertedArray, 0, arr, 0, arr.length);

	}

}
