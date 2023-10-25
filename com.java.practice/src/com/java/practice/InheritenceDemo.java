package com.java.practice;

 class Employee {
	
	String name;
	double salary;
	
	Employee(String name,double salary){
		this.name = name;
		this.salary= salary;
	}
	Employee(){
		
	}
	
	String getName() {return name;}
	void setName(String name) {this.name = name;}
	double getSalary() {return salary;}
	void setSalary(double salary) {this.salary = salary;}
	
	void raiseSalary(double percent) {
	
      salary += salary*percent/100;	
	
}
	}
 
 
 class Manager extends Employee{
	 double bonus;
	 
	 Manager(String name,double salary,double bonus){
		 this.name = name;
		 this.salary = salary;
		 this.bonus = bonus;
	 }
	 void setBonus(double bonus){this.bonus = bonus;}
	 double getBonus() {return bonus;}
	 
	 void data() {
		 
		 System.out.println(name+" you earned "+salary+" monthly salary and a "+bonus+" bonus " );
		 
	 }
	 
 }
 public class InheritenceDemo {

	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Aarif",20000);
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		
		e1.setName("John");
		e1.setSalary(30000); 
		
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		
		e1.raiseSalary(10);
		System.out.println(e1.getSalary());
		
		Manager m1 = new Manager("Aarif",20000,3000);
		
		System.out.println(m1.getSalary());
		System.out.println(e1.getName());
		System.out.println(m1.getBonus());
		m1.data();
		

	}

}
 
