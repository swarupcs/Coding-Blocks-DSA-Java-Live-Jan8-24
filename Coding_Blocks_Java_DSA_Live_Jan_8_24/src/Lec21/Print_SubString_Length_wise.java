package Lec21;

public class Print_SubString_Length_wise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "coding";
		Print(str);

	}

	public static void Print(String s) {
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				System.out.println(s.substring(i, j));
			}
		}
	}

}
