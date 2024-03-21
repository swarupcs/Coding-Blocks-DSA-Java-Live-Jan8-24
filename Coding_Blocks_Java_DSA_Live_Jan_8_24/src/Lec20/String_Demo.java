package Lec20;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println(s1);			//hello
		System.out.println(s2);			//hello
		System.out.println(s3);			//hello
		System.out.println(s1==s2);		//true
		System.out.println(s1==s3);		//false
		System.out.println(s4==s3);		//false
		
		

	}

}
