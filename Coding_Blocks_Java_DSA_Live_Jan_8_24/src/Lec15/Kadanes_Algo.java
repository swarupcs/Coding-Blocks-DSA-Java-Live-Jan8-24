package Lec15;

public class Kadanes_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(MaximumSubArraySum(arr));

	}
	
	public static int MaximumSubArraySum(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int i_idx = 0;
		int j_idx = 0;
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
//			i_idx = i;
//			j_idx = i;
			sum = sum+arr[i];
			ans = Math.max(ans, sum);
			if(sum < 0) {
				sum = 0;
			}
		}
//		System.out.println(i_idx);
//		System.out.println(j_idx);
		return ans;
	}

}
