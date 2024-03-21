package Assignment_3_Arrays;

import java.util.Scanner;

public class P_12_Calculate_The_Sum {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // size of array
        int [] arr = new int[n]; // array;
        int [] temp = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0 ; i<n; i++){
            temp[i] = arr[i];
        }
        int q = sc.nextInt(); // no. of operations;
        while (q-->0){
            int p = sc.nextInt(); // operations;
            for(int i=0; i<n; i++){
                int r = i-p;
                if(r<0){
                    r = n+r;
                }
                arr[i] += temp[r];
            }
            for(int i=0; i<n; i++){
                temp[i] = arr[i];
            }
        }
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }

}
