package com.bmpl.inheritance;

class Person extends Object {
	String personName; //global variable, instance variables
	int personId;
	
	void input(String personName, int personId){
		this.personName = personName;
		this.personId = personId;
	}
	
	void output(){
		System.out.println("Person Name = "+personName);
		System.out.println("Person Id = "+ personId);
	}
}

class Student extends Person{
	
	String studName;
	int studRollno;
	
	void studInput(String studName, int studRollno){
		super.personName = studName;
		super.personId = studRollno;
		this.studName = studName;
		this.studRollno = studRollno;
	}
	
	void studOutput(){
		super.output();
		System.out.println("Student Name = "+studName);
		System.out.println("Student Rollno = "+studRollno);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {

		Student ram = new Student();
		
		//ram.input("Rohan", 1001);
		//ram.output();
		ram.studInput("Mohan", 1003);
		ram.studOutput();
	}

}
