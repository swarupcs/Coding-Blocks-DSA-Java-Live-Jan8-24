package Lec33;

//import Lec24.Power;

//import java.util.ArrayList;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		Student s = new Student();
		s.name = "Raj";
		s.age = 20;
		s.Intro_yourSelf();
		Student s1 = new Student();
		s1.name = "Kamlesh";
		s1.age = 20;
		s1.Intro_yourSelf();
		s1.SeyHey("Puneet");
		Student.MentorName();
//		Power.pow(3, 4);
		s.MentorName();
//		ArrayList<Integer> ll = new ArrayList<>();
//		ArrayList<Integer> ll1 = new ArrayList<>();
//		ll.add(10);
//		ll1.add(10);

	}
	

}
