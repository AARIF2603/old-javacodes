package revision;

import java.util.Scanner;

public class loopControl2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n,sum=0.0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter th numbers.to stop enter a '-' number :");
		while(true) {
			n = scanner.nextDouble();
			if(n<0.0) {
				break;
			}
			sum += n;
		}
		System.out.println("Sum is:" + sum);

	}

}
