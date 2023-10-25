package revision;
import java.util.Scanner;
public class primeOrnot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int n,i,flag;
		flag=0;
		System.out.println("Enter a NUMBER : ");
		n = scan.nextInt();
		if(n==0||n==1) {
			System.out.println("not a prime");
		}
		else {
			for(i=2;i<n;i++) {
				if(n%i==0) {
					System.out.println("not a prime");
					flag=1;
					break;
				}
			}
		}
		
		if(flag==0) {
			System.out.println("prime number");
		}
		

	}

}
