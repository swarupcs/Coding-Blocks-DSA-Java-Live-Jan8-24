package Lec23;

public class Maximum_SubArray_Size_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,1,2,3,7,6,8,2,3};
		int k = 3;
		System.out.println(MaximumSum(arr, k));

	}
	
	public static int MaximumSum(int[] arr, int k) {
		int sum = 0;
		//1st window
		for(int i=0; i<k; i++) {
			sum = sum + arr[i];
		}
		int ans = sum;
		for(int i=k; i<arr.length; i++) {
			//growing
			sum = sum + arr[i];
			//shrink
			sum = sum - arr[i-k];
			
			//ans update
			ans = Math.max(ans, sum);
		}
		
		return ans;
	}

}
