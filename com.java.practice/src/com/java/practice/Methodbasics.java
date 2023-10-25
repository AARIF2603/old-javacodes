package com.java.practice;

public class Methodbasics {
	/*static int getVolume(int l,int b,int h) {
		
		return  l*b*h;
	}
	
	static void printLine() {
		System.out.println("---------------------------");
	}

	public static void main(String[] args) {
		
		int volume = getVolume(5,4,7);
		printLine();
		System.out.println(volume);
		System.out.println(getVolume(20,4,7));
		printLine();
		

	}*/
	
	
  static void getVolume(int l,int b,int h) {
		
		int vol = l*h*b;
		printLine();
		System.out.println( vol );
	}
  
  static void printLine() {
		System.out.println("---------------------------");
	}

	public static void main(String[] args) {
		
		 getVolume(5,4,7);
		 getVolume(10,4,5);
		 
	}
	
	

}
