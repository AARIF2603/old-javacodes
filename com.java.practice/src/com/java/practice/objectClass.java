package com.java.practice;

//Creating class and Object
// Method Invoking



class Box {
	
	int length;
	int height;
	int breadth;
	
	/*Box(int l,int b,int h){  //this pointer not needed here
		length = l;
		breadth = b;
		height = h;
	}*/
	
	Box(int length,int breadth,int height){  /*this Pointer -- Used to specifically denote 
		                                          the variables if we use same variables inside 
		                                          and outside Constructor*/
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	int volume (){
	
		return length*breadth*height;
	}
}
public class objectClass {

	public static void main(String[] args) {
		
		Box blackBox = new Box(8,5,10);
		/*blackBox.length = 8;
		blackBox.height = 10;
		blackBox.breadth = 5;*/
		
		System.out.println(blackBox.height);
		
		Box woodenBox = new Box(20,20 ,20);
		woodenBox.height = 20;
		woodenBox.breadth = 20;
		woodenBox.length = 20;
		
		System.out.println(woodenBox.height);
		
		System.out.println("volume of blackbox is "+blackBox.volume());
		System.out.println("volume of blackbox is "+woodenBox.volume());
	
	}

}
