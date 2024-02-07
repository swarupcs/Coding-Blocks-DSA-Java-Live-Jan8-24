package Lec_7;
import java.util.*;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, i, count=0;
	     Scanner s = new Scanner(System.in);
	      
	      num = s.nextInt();
	      
	      for(i=2; i<num/2; i++)
	      {
	         if(num%i == 0)
	         {
	            count++;
	            break;
	         }
	      }
	      
	      if(count==0)
	         System.out.println("It is a Prime Number.");
	      else
	         System.out.println("It is not a Prime Number.");
	   }
	}


