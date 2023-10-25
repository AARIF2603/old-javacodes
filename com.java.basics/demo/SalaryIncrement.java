package demo;
import java.util.Scanner;
public class SalaryIncrement {
	static double getIncrement(double salary)
	   {
	       
	       return salary * 1.20;
	   }

	   public static void main(String[] args) {
	       
	       double incSalary = getIncrement(20000);
	       System.out.println("Hiked Salary: "+incSalary);
	       
}
}