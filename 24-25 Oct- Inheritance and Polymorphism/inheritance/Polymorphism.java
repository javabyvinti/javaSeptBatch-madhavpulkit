package com.bmpl.inheritance;

public class Polymorphism {

	void add(int a, int b){
		System.out.println(a+b);
	}
	
	void add(float a, int b){
		System.out.println(a + b);
	}
	
	int add(int a, int b, int c){
		return a+b+c;
	}
	
	void add(float a, float b){
		System.out.println(a + b);
	}
	
	long add(long a, long b){
		return a+b;
	}
		
	public static void main(String[] args) {
		
		
		int value = 90;
		float val = 90.76f;
		
		//overloading
		String data = String.valueOf(value);	// "90"
		String d = String.valueOf(val);
		System.out.println("Data is = "+ data);
	
		Polymorphism obj = new Polymorphism();

		obj.add(89.65F, 65.87f);
		System.out.println(obj.add(65866666633l, 98875443326l));
		obj.add(89, 90);
		System.out.println(obj.add(70, 80, 80));
	
	}

}
