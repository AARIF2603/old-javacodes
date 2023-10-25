package revision;  // Days of the week using Switch

import java.util.Scanner;

public class switchDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a day : ");
		String day = scan.nextLine();
		switch (day) {
		case "Sunday":
			System.out.println("its Sunday");
			break;
		case "Monday":
			System.out.println("its Monday");
			break;
		case "Tuesday":
			System.out.println("its Tuesday");
			break;
		case "Wednesday":
			System.out.println("its Wenesday");
			break;
		case "Thursday":
			System.out.println("its Thursay");
			break;
		case "Friday":
			System.out.println("its Friday");
			break;
		case "Saturday":
			System.out.println("its Saturday");
			break;
		default:
			System.out.println("Given data is incorrect");
			
			
		}
		

	}

}
