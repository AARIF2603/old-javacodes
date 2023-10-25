package revision;

import java.util.Scanner;

public class loopControl { //nearest no divisible by 10 using while loop

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scanner.nextInt();
		while(n>=0) // or while (true) 
			{
			if(n%10==0) {
				System.out.println(n);
			    break;
			}
			n--;
		}
		
	}

}
