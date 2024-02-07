package lec_3;
import java.util.Scanner;


public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        int principal = scanner.nextInt();

        System.out.print("Enter rate of interest : ");
        int rateOfInterest = scanner.nextInt();

        System.out.print("Enter time period : ");
        int timePeriod = scanner.nextInt();
        int simpleInterest = (principal * rateOfInterest * timePeriod) / 100;

        System.out.println("Simple Interest: " + simpleInterest);
	}

}
