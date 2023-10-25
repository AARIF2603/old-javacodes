package demo;
//CountDigit
import java.util.Scanner;

public class CountDigit {
	 public static void main(String[] args) {
	       // Number from user , count=0
	       // 123 ==> 3 digit 12 3 => count=3
	       // 123 ==> 123/10 12 =>12/10 =>1/10 => 0
	       
	       
	       Scanner scan = new Scanner(System.in);
	       System.out.println("Enter the number: ");
	       
	       int num=scan.nextInt(); // 12 , 1, 0
	       int count = 0; // 1 , 2 , 3
	       while(num!=0)
	       {
	           count++;
	           num=num/10;
	       }
	       
	       System.out.println("Number of digits: "+count);
	   }

}
