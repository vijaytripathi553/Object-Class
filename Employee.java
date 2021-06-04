Q. 
public class Demo {

public static void m1(Object o){

//display employee data here
}
public static void main(String[] args) {

//create Employee object here with
101,sam,1000 data

//call m1 method by passing this Employee
object
}
}

Ans.

package com.pankaj.assignment;

public class Employee {
	private int roll;
	private String firstName;
	private String lastName;
	
	
public Employee(int roll, String firstName, String lastName) {
		this.roll = roll;
		this.firstName = firstName;
		this.lastName = lastName;
	}

// m1 method
public static void m1(Employee o)
{
	System.out.println("Roll No:"+o.roll);
	System.out.println("Roll No:"+o.firstName);
	System.out.println("Roll No:"+o.lastName);
	
}


	//Main Method
	public static void main(String[] args) {
	// Creating an object of Employee class
	Employee e=new Employee(101,"Vijay","Tripathi");
	Employee.m1(e);
		
	}
}

OUTPUT

Roll No:101
Roll No:Vijay
Roll No:Tripathi
