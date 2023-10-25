package revision;

import java.util.Scanner;

public class methodDemo3 {

	static boolean numofdigit(int num) {
		
			if(num>=10&&num<=99)
				return true ;
		    return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bool;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num= scan.nextInt();
		bool=numofdigit(num);
		System.out.println(bool);

	}

}
