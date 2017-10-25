package com.bmpl.inheritance;

import java.util.Scanner;

class Cons1 {

	Integer data = 90;
	String value = "5454";
	Cons1() {
		if(value.contains(".")){
			System.out.println("Contains decimal");
		} else{
			System.out.println("Doesn't contain decimal");
		}
		System.out.println("Default cons of Cons1 class");
	}

	Cons1(int v) {
		System.out.println("Param of Cons1 " + v);
	}

	// super -->

	int val = 10;

	void consMethod() {
		System.out.println("Parent class cons method");
	}

	void data() {
		System.out.println("Parent class data");
	}
}

class Cons2 extends Cons1 {

	Cons2() {
		// super();
	//	super(6);
		System.out.println("Default cons of Cons2 class");
	}

	Cons2(int data) {
		// this();
		System.out.println("Param of Cons2 class " + data);
	}

	int val2 = 90;

	void print() {
		System.out.println("print of child");
	}

	// void data(){
	//// super.data();
	//// super.val = 60;
	//// this.val2 = 100;
	//// super.consMethod();
	// System.out.println("Child class data");
	// }
}

public class ConstructorDemo {

	public static void main(String[] args) {
		// inheritance --> upcasting
		// upcasting is done automatically hence it is implicit
		// to check the common methods between parent and child class

		Cons2 obj = new Cons2();// cons2 --> constructor
		obj.data();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your value");
		String first = scanner.next();
		System.out.println(first.length());
		System.out.println(Float.MAX_VALUE);
		
		
		if(first.contains(".")){
			Double.parseDouble(first);
			
			
		} else{
			
		}
	}

}
