package demo;
//Factorial
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		   // Factorial : 5 => 120
		   // 5 X 4 X 3 X 2 X 1 == >120    
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("Enter the number: ");
		   int num=scanner.nextInt();
		   
		   int factorial=1; // factorial = 0
		   
		   // factorial = 1 k=5
		   // factorial = 5 k=4
		   // factorial = 20 k=3
		   // factorial = 60 k=2
		   // factorial = 120 k=1
		   
		   for(int k=num; k>1 ;k--)
		   {
		       factorial = k*factorial;
		   }
		   
		   System.out.println("Factorial is: "+factorial);
		   
		   }

}
