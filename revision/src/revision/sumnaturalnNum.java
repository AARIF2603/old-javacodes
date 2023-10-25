package revision;

import java.util.Scanner;

public class sumnaturalnNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,a=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scanner.nextInt();
		for(i=1;i<=n;i++) {
			System.out.println(i + " ");
			a += i;
		}
		System.out.println("Sum of given n natural num " + a);

	}

}
