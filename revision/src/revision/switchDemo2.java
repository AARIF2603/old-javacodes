package revision;

import java.util.Scanner;

public class switchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an Alphabet: ");
		char alphabets = scan.next().charAt(0);
		switch (alphabets) {
		case 'a':
		
		case 'e':
			
		case 'i':
			
		case 'o':
			
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonent");
		}
	}

}
