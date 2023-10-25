package revision;//getting multiple input in array from user
import java.util.Scanner;

public class arrayLoopio {
	public static void main(String args[]) {
		int i;
		int []a = new int[6];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers : ");
	
		for(i=0;i<a.length;i++) 
			a[i]=scan.nextInt();
		for(i=0;i<a.length;i++) 
			System.out.println(a[i]);
		
	}

}
