package Lec16;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5,6,8,9,11,13,15,20,21};
		int item = 11;

	}
	
	public static int Search(int[] arr, int item) {
		int low = 0;
		int high = arr.length - 1;
		while(low <= high) {
			int mid = (low + high) / 2;
			if(arr[mid] == item) {
				return mid;
			} else if(arr[mid] < item) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1; 
	}

}
