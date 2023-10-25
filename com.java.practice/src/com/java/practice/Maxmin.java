package com.java.practice;
import java.util.Scanner;
public class Maxmin {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a,b,c,d1,d2,d3,d4;
		System.out.println("Enter a");
		a = scan.nextInt();
		System.out.println("Enter b");
		b = scan.nextInt(); 
		System.out.println("Enter c");
		c = scan.nextInt();
		d1 = a+b*c;
		d2 = c+a/b;
		d3 = a%b+c;
		d4 = a*b+c;
		if(d1 > d2 && d1 > d3 && d1 > d4)
			System.out.println("d1 is Max "+d1);
		else if(d2 > d3 && d2 > d4)
			System.out.println("d2 is Max "+d2);
		else if(d3 > d4)
			System.out.println("d3 is Max "+d3);
		else
			System.out.println("d4 is Max "+d4);
		
		if(d1 < d2 && d1 < d3 && d1 < d4)
			System.out.println("d1 is Min "+d1);
		else if(d2 < d3 && d2 < d4)
			System.out.println("d2 is Min "+d2);
		else if(d3 < d4)
			System.out.println("d3 is Min "+d3);
		else
			System.out.println("d4 is Min "+d4);
	}

}
