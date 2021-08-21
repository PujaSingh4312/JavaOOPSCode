package com.practice.oops.IfelseConcept;

public class IfElseIFExampleStudentResult {

	public void result(int marks)
	{
		if(marks>=90 && marks<=100) {
			System.out.println("grade A+");
		}
		else if(marks>=80 && marks<90) {
			System.out.println("grade A");
		}
		else if(marks>=70 && marks<80) {
			System.out.println("garde B");
		}
		else if(marks>=60 && marks<70) {
			System.out.println("grade C");
		}
		else if(marks>=50 && marks<60) {
			System.out.println("grade d");
		}
		else  if(marks<50) {
			System.out.println("fail");
		}
		else {
			System.out.println("Invalid marks");
		}
		
		
		
		//System.out.println("Student result completed");
		
	}
	public static void main(String[] args) {
		IfElseIFExampleStudentResult ram=new IfElseIFExampleStudentResult();
		ram.result(95);
		
		IfElseIFExampleStudentResult mohan=new IfElseIFExampleStudentResult();
		mohan.result(85);
		
		IfElseIFExampleStudentResult sohan=new IfElseIFExampleStudentResult();
		sohan.result(75);
		
		IfElseIFExampleStudentResult rohan=new IfElseIFExampleStudentResult();
		rohan.result(65);
		
		IfElseIFExampleStudentResult shyam=new IfElseIFExampleStudentResult();
		shyam.result(45);
		
		IfElseIFExampleStudentResult rama=new IfElseIFExampleStudentResult();
		rama.result(102);
		
		System.out.println("Student result completed");
	}
}
