package Lec_4;
import java.util.Scanner;
public class Grade_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int marks = scanner.nextInt();
		if (marks > 90) {
            System.out.println("O");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("A+");;
        } else if (marks > 70 && marks <= 80) {
            System.out.println("A");
        } else if (marks > 50 && marks <=70) {
            System.out.println("B");
        } else if(marks < 50 ){
            System.out.println("Fail");
        }

	}

}
