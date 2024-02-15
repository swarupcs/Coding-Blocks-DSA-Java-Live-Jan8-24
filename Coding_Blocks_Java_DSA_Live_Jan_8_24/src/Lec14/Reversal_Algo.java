package Lec14;

public class Reversal_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		int k = 1;
		RotateArray(arr, k);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void RotateArray(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		Reverse(arr, 0, n-k-1);	// Reverse first part	
		Reverse(arr, n-k, n-1);	//Reverse second part	
		Reverse(arr, 0, n-1);	//Reverse whole array
		
	}
	
	public static void Reverse(int[] arr, int i, int j) {
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
