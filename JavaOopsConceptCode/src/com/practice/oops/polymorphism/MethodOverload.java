package com.practice.oops.polymorphism;

//Polymorphisim -- poly -->many morphis-->form  method overloading is called compile time polymorphism
public class MethodOverload {
    
	public void display(int x)
	
	{
		System.out.println("Welcome to integers");
	}
	
	public void display(String y)
	
	{
		
		System.out.println("Welcome to Strings");
	}
	

      public static void main (String[] args) {
    	  
    	  MethodOverload obj=new MethodOverload();
    	  
    	  String s="Hello";
    	  
    	  obj.display(s);
    	  obj.display(12);
    	//  obj.display(10,20); when we call display(int,int) then compiler at compile time will check which method to call//
      }
    	  
}
      
      