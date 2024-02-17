package Lec15;

public class Max_SubArray_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(MaximumSubArraySum(arr));

	}
	
	public static int MaximumSubArraySum(int[] arr) {
		int ans = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			for(int j=i; j<arr.length; j++) {
				sum+=arr[j];
				ans = Math.max(ans, sum);
			}
		}
		return ans;
	}

}
