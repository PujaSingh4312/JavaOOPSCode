package com.practice.oops.IfelseConcept;

public class Student {
	
	public void scoring(int marks)
	{
		if(marks>90)
		{
			System.out.println("Student grade A");
		}
		else if(marks>80 && marks<90)
		{
			System.out.println("Student grade B");
		}
		else if(marks<70 && marks>40)
		{
			System.out.println("Student grade C");
		}
		else
		{
			System.out.println("Fail");
		}
			
		}
	public static void main(String[] args) {
		Student ram=new Student();
		ram.scoring(85);
		
		Student rohan=new Student();
		rohan.scoring(70);
		
		Student mohan=new Student();
		mohan.scoring(45);
		
	}

}
