package com.practice.oops.polymorphism;

public class OverridingChild extends OverridingParent{
	
	public int addingExample(int a,int b)
	{
		
		int bal=a+b+20;
		
		return bal;
	}
	
	

	public static void main(String[] args) {
		
		OverridingChild s1=new OverridingChild();
		int sumExample=s1.addingExample(10,20);
		System.out.println("This is first result"+sumExample);
		
		OverridingParent s2=new OverridingParent();
		int sumExample2=s2.addingExample(10,20);
		System.out.println("sumExample 2 "+sumExample2);
		
        
        OverridingParent s3 = new OverridingChild();
        int sumExample3= s3.addingExample(10, 20);
        System.out.println("sumExample 3 "+ sumExample3);
        
   //     OverridingChild s4=new OverridingParent();
        
		
		
		

	}

}
