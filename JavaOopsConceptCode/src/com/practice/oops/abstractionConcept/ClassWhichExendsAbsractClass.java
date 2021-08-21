package com.practice.oops.abstractionConcept;

public class ClassWhichExendsAbsractClass extends AbstractionExample {

	@Override
	public void requiredpartsofmachine() {
		// TODO Auto-generated method stub
		System.out.println("We are defining the abstract method inside this class");
	}
	
	public void specificToThisClass()
	{
		System.out.println("inside this class");
	}
	
	
 public static void main(String[] args) {
	 ClassWhichExendsAbsractClass c =new ClassWhichExendsAbsractClass();
	 c.specificToThisClass();
	 c.normalMethod();
	 c.requiredpartsofmachine();
	 
	 AbstractionExample a = new ClassWhichExendsAbsractClass() ;
	 a.normalMethod();
	 a.requiredpartsofmachine();
 }
	
}
