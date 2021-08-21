package com.practice.oops.abstractionConcept;

public class WhiteHouse implements House{
	
	public void buildingHouse()
	{
		System.out.println("building a big house");
	}
	
    public void constructingHouse()
    
    {
    	
   	System.out.println("constructing a big house");
   	
   	
   }
    public static void main(String[] args) {
	  
	WhiteHouse s=new WhiteHouse();
	
	s.buildingHouse();
	s.constructingHouse();
  }
  
  }

     
     
     
    