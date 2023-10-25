package revision;
import java.util.Scanner;
public class methodDemo1 {
	
	static int sumofdigit(int num) {
		int digit;
		int sum = 0;
		while(num>0) {
			digit= num%10;
			sum += digit;
			num = num/10;
			
		}
		return sum ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num= scan.nextInt();
		result=sumofdigit(num);
		System.out.println(result);
		

	}

}
