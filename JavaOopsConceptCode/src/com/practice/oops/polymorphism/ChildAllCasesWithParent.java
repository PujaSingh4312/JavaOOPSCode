package com.practice.oops.polymorphism;

public class ChildAllCasesWithParent extends ParentAllCasesWithChild{

	public void commonMethod() {
		System.out.println("This is inside child");
	}
	
	public void childSpecificMethod() {
		System.out.println("This is child specific");
	}
	
	public static void main(String[] args) {
		
		ParentAllCasesWithChild p = new ParentAllCasesWithChild();
		p.commonMethod();
		p.parentSpecificMethod();
		
		//p2 wants can access commonMethod() and parentSpecific() but p2 will no decide whose commonMethod. This will
		//be decide by JVM at runtime based on whose object we are creating
		ParentAllCasesWithChild p2 = new ChildAllCasesWithParent();
		p2.commonMethod();
		p2.parentSpecificMethod();
		
		//here c wants to access commonMethod() , CS() and pS()  and we are creating CHILD obj
	   ChildAllCasesWithParent c = new ChildAllCasesWithParent();
		c.commonMethod(); //the common method of parent class will shadow from common method of child class
    	c.childSpecificMethod();
    	c.parentSpecificMethod();
    	
    	
    	//c2 wants access of commonMethod(),cS() and pS()  but we are creating object of parent which has only cM() and pS()
        //HENCE COMPILER GIVES ERROR
    //	ChildAllCasesWithParent c2 =new ParentAllCasesWithChild();
	
	}
}
