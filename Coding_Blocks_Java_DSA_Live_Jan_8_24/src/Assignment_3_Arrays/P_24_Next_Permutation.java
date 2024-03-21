package Assignment_3_Arrays;

import java.util.Scanner;

public class P_24_Next_Permutation {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); // Number of digits
            int[] arr = new int[N];

            // Input array elements
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }

            nextPermutation(arr);
            printArray(arr);
        }
    }

    public static void nextPermutation(int[] arr) {
    	int i1=-1;
        int i2=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                i1=i;
                break;
            }
        }
        if(i1==-1){
            reverse(arr,0);
        }
        
        else{
            for(int i=arr.length-1;i>=0;i--){
                if(arr[i]>arr[i1]){
                    i2=i;
                    break;
                }
            }

            swap(arr,i1,i2);
            reverse(arr,i1+1);
        }
    }

    public static void reverse(int[] nums, int start) {
    	int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

    public static void swap(int[] nums, int i, int j) {
		// TODO Auto-generated method stub
    	int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
		
	}

	public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
