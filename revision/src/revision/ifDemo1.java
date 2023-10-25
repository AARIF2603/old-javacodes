package revision;
import java.util.Scanner;

public class ifDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter marks: ");
		int marks= scanner.nextInt();
		if(marks>=90)
			System.out.println("A Grade");
		else if(marks>=80)
			System.out.println("B Grade");
		else if(marks>=70)
			System.out.println("C Grade");
		else if(marks>=60)
			System.out.println("D Grade");
		else
			System.out.println("E Grade");
		

	}

}
