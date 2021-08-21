package com.practice.oops.constructionconcept;

public class Employee {
     
    int id;
    String name;
    Employee(int i,String n)
    {
    	id=i;
    	name=n;
    }
    
	public void display() {
		
		System.out.println(id+""+name);
	}
	
	}