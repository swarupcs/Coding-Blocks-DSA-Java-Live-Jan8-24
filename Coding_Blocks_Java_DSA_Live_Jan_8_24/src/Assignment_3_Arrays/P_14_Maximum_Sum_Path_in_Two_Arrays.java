package Assignment_3_Arrays;

import java.util.Scanner;

public class Maximum_Sum_Path_in_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		// For test cases
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int[] arr1 = new int[m];
			int[] arr2 = new int[n];
			for (int j = 0; j < m; j++) {
				arr1[j] = sc.nextInt();
			}
			for (int j = 0; j < n; j++) {
				arr2[j] = sc.nextInt();
			}
			System.out.println(Maximum_Sum_Path(arr1, arr2, m, n));
		}
		
		
	}

	public static int Maximum_Sum_Path(int [] arr1, int [] arr2, int m, int n){
        int i = 0;
        int j = 0;
        int s1 = 0;
        int s2 = 0;
        int ans = 0;
        while(i<m && j<n){
            if(arr1[i] < arr2[j]){
                s1 += arr1[i++];
                
            }
            else if(arr1[i]>arr2[j]){
                s2 += arr2[j++];
            }
            else{
                ans += Math.max(s1, s2) + arr1[i];
                s1 = 0;
                s2 = 0;
                i++;
                j++;
            }
        }
        while (i<m){
            s1 += arr1[i++];
        }
        while (j<n){
            s2 += arr2[j++];
        }
        ans += Math.max(s1, s2);
        return ans;
    }


}
