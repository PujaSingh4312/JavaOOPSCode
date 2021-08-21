package com.practice.oops.abstractionConcept;


//Abstract class has both abstract method as well as nomal method
// We cannot create the object for abstract class because abstact class has some methods which just declared
//and not defined. Hence we cannot create object of Abstract class
// So how we can use it by creating a class which extends abstract class and this new class has to first 
// define all the abstract methods declared in abstract class.
public abstract class AbstractionExample {
	
	public abstract void requiredpartsofmachine();
	
	
	
	
	public void normalMethod() {
		System.out.println("This is normal method");
	}
	
    }


