package com.bmpl.inheritance;

//we cannot inherit final class

class A{
	
	final int value = 90;
	//4 types of access specifier--> 
	
	//private -->  access within class
	//public --> accessible to anywhere inside package or outside package
	//protected --> access within class and outside class through inheritance
	//default --> access inside package 
	
	private int a = 10;	//access specifier--> 
	public int b = 20;
	public int c = 30;	//default	
	protected int d = 40;
	
//	A(int a){
//		value++;
//		System.out.println("A param");
//	}
	
}

final class B extends A{
	B(){
		
		//super();
		System.out.println("B default" + d);
	}
	
}

//class C extends B{
//	
//}

public class Test extends A{	//

	public static void main(String[] args) {
		B obj = new B();

	}

}
