package com.bmpl.inheritance;

class GrandParent{
	int value = 10;
}

class Parent extends GrandParent{
	int value = 20;
}

class Child extends Parent{
	int value = 30;
	
	void calculate(int value){
		// keyword --> super keyword
		value = value + this.value + super.value + ((GrandParent)this).value;
		 
		System.out.println("Value = " + value);
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Child child = new Child();
		child.calculate(40);
	}
}
