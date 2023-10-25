package revision;

import java.util.Scanner;

public class oddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scanner.nextInt();
		for(i=1;i<=n;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
				
		}

	}

}
