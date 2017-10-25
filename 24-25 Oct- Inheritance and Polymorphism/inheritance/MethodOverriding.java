package com.bmpl.inheritance;

class University{
	
	/*final*/ void mcaSyllabus(){
		System.out.println("Mandatory syllabus for MCA");
	}
	
	void data(){
		
	}
	
	void show(){
		System.out.println("Show of Univ.");
		
	}
	protected void mbaSyllabus(){
		System.out.println("Mandatory syllabus for MBA");
	}
}

class BPIT extends University{
	
	//we cannot override the final method
	@Override
	void mcaSyllabus(){
		super.mcaSyllabus();
		System.out.println("New course added");
		System.out.println("New topics added");
	}
	
	public void mcaSyllabus(int a, int b){
		
	}
	
	void show(int i){
		System.out.println("Show of BPIT");
	}
	
	String data(String a){
		return a;
	}
	
}
class JIMS extends University{

	@Override	//annotations --> developer and compiler --> compiler --> ignore
	protected void mbaSyllabus() {
		super.mbaSyllabus();
		
	}
	
	
}

public class MethodOverriding {

	public static void main(String[] args) {
		BPIT obj = new BPIT();
		
	}
}
