package revision;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,a=1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scanner.nextInt();
		for(i=n;i>1;i--) {
			a *= i;
		}
		System.out.println(a);

	}

}
