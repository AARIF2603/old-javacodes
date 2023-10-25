package com.java.practice;


public class Linkedlist {

	Node head;
	class Node{
		
		int data;
		Node ref;
	
	Node(int data){ 
		
		this.data= data;
		ref=null;
		
	}
	}	
	
	Linkedlist(){
	
		head=null;
	}
	
	public void addFirst(int data) {
		
		Node newNode = new Node(data);
		//when list is empty
		if(head==null)
			head=newNode;
		else {//list not empty
			newNode.ref=head;
			head =newNode;
		}
	}
		
		public void display() {
			Node temp = head;//starts at the head
			while(temp!=null)//implies the loop ends at null
			{
				System.out.print(temp.data + " ");
				temp=temp.ref;
			}
		
				
				}
		public void insertatPosition(int pos,int data) {
			if(pos==0)
			{
				addFirst(data);
				return;
			}
			Node newNode = new Node(data);
			Node temp=head;
			for(int i=1;i<pos;i++) {
				temp=temp.ref;
				if(temp==null) {//if user gives wrong data
					throw new IllegalArgumentException("invalid position "+ pos);//instead of print statement showing exception
				}
			}
			newNode.ref=temp.ref;
			temp.ref=newNode;	
		}
		public void addLast(int data) {
			Node newNode = new Node(data);
			
			if(head==null)
				head = newNode;
			else if(head.ref==null) {
				head.ref=newNode;
			}
			else {
				Node temp=head;
				while(temp.ref!=null) {
					temp=temp.ref;
				}
				temp.ref=newNode;
			}
				
			}
		public void deleteFirst() {
			head=head.ref;
		}
		public void deleteLast() {
			if(head==null)
				System.out.println("list is empty");
			else if(head.ref==null) {
				head=head.ref;
			}
			else {
				Node temp;
				
			}
		}
		}
	


