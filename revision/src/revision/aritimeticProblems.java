package revision;

import java.util.Scanner;

public class aritimeticProblems {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		/*System.out.println("Enter a:");
		//int a = scan.nextInt();
		float a = scan.nextFloat();
		System.out.println("Enter b:");
		//int b = scan.nextInt();
		float b = scan.nextFloat();
		float c1,c2,c3,c4,c5;
		c1= a+b;
		c2= a-b;
		c3= a*b;
		c4= a/b;
		c5= a%b;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		*/
		
		/*int a= 5;
		a += 100;
		System.out.println(a);*/
		
		/*int a=3,b=4,c;
		c=a+b+a++ + b++ + ++a + ++b; 
		System.out.println(c);*/
		
		/*int a= 15;
		a = a++ + ++a; 
		System.out.println(a);*/
		
		/*int a=10,b=20,c;
		c = a++ + b++; 
		System.out.println(c);*/
		
		/*int a=0,b=0,c;
		c= --a * --b * --a * b--; 
		System.out.println(c);
		*/
		
		/*int a= 5;
		System.out.println(a&1);
		*/
		
		/*int a= 5,b;       // (a^b)^a = b
		b= (a^3)^a;       // (a^b)^b = a
		System.out.println(b);
		*/
		
		// Swapping value
		int a= 5,b=3,temp; 
		temp=b;
		b= (a^b)^b;
		a= (a^temp)^a;
		System.out.println(b);
		System.out.println(a);
		
		
	}

}
