package demo;
//GuessGame--Do While

import java.util.Scanner;
import java.util.Random;

public class GuessGame {
	public static void main(String[] args) {
	       /*
	        * One num from user One random num
	        */

	       Scanner scan = new Scanner(System.in);
	       Random random = new Random();

	       int guessNum;
	       int randomNum;
	       do {
	           System.out.println("Guess the number between 1 to 10: ");
	           guessNum = scan.nextInt();
	           randomNum = 1 + random.nextInt(10);

	           System.out.println("Guessed number: " + guessNum);
	           System.out.println("Random number: " + randomNum);
	       } while (guessNum != randomNum);

	   }


}
