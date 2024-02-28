package Lec18;

import java.util.Scanner;

public class Book_Allocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t-- > 0) {
			int no_books = sc.nextInt(); // number of books
			int no_students = sc.nextInt(); // number of Student
			int[] page = new int[no_books];

			for (int i = 0; i < page.length; i++) {
				page[i] = sc.nextInt();
			}

			System.out.println(MinPages(page, no_students));
		}
	}

	public static int MinPages(int[] page, int no_books) {
		int low = 0;
		int high = 0;
		for (int i = 0; i < page.length; i++) {
			high += page[i];
		}
		int ans = 0;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (isitpossible(page, no_books, mid) == true) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;

	}

	public static boolean isitpossible(int[] page, int no_students, int mid) {
		// TODO Auto-generated method stub
		int student = 1;
		int readpage = 0;
		for (int i = 0; i < page.length;) {
			if (readpage + page[i] <= mid) {
				readpage += page[i];
				i++;
			} else {
				student++;
				readpage = 0;
			}
			if (student > no_students) {
				return false;
			}

		}
		return true;

	}

}
