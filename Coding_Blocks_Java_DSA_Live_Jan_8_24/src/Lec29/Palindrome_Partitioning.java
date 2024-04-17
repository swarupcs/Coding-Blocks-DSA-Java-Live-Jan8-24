package Lec29;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aab";
		List<String> list = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
		Partitioning(str, list, ans);
		System.out.println(ans);

	}

	public static void Partitioning(String str, List<String> list, List<List<String>> ans) {
		// TODO Auto-generated method stub
		if(str.length() == 0) {
			ans.add(new ArrayList<String>(list));
			return;
		}
		
		for (int i = 1; i <= str.length(); i++) {
			String s = str.substring(0, i);
			if (is_Palindrome(s) == true) {
				list.add(s);
				Partitioning(str.substring(i), list,ans);
				list.remove(list.size() - 1);
			}

		}
		
		
		
	}
	
	public static boolean is_Palindrome(String s) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}

}
