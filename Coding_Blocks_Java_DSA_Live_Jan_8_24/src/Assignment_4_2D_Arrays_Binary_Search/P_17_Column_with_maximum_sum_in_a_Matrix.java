package Assignment_4_2D_Arrays_Binary_Search;

import java.util.Scanner;

public class P_17_Column_with_maximum_sum_in_a_Matrix {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        MaximumSumColumn(arr);
    }
    public static void MaximumSumColumn(int[][] arr) {
        // TODO Auto-generated method stub
        int ans = Integer. MIN_VALUE;
        int maxCol = 0;
        for(int i=0; i<arr.length; i++) {
            int sum = 0;
            for(int j=0; j<arr.length; j++) {
                sum = sum + arr[j][i];
                if(ans<sum) {
                    ans = sum;
                    maxCol = i;
                }
            }
//          System.out.println("["+i+"]"+"Sum : " + sum);
        }
        System.out.println(maxCol+1 + " " + ans);
    }

}
