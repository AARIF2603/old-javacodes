package com.java.practice;

public class Demo {

	public static void main(String[] args) {
		
		Linkedlist list = new Linkedlist();
		
		list.addFirst(7);
		list.addFirst(6);
		list.addFirst(4);
		list.display();
		System.out.println(" ");
		list.insertatPosition(1,5);
		list.display();
		System.out.println(" ");
		list.addLast(8);
		list.display();

	}

}
