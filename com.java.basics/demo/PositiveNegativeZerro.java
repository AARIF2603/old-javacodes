package demo;
//Positive Negative or Zero
import java.util.Scanner;

public class PositiveNegativeZerro {
	public static void main(String[] args) {

	       // Positive , Negative or Zero

	       Scanner scanner = new Scanner(System.in);
	       System.out.println("Enter the number: ");

	       int num = scanner.nextInt();

	       if (num > 0) {
	           System.out.println(num);
	           System.out.println("Is positive");
	       } else if (num < 0)
	           System.out.println(num + " is negative ");
	       else
	           System.out.println(num + " is zero");

	   }

}
