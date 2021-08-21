package com.practice.oops.IfelseConcept;
//WAP to define rich people,middle,poor and bPL people in India//
// in case of if/else   If condition satisfy then it won't go to else and vice-versa
public class People {

	public void salary(int Salary)
	{
		if(Salary>=100000 && Salary<=200000)
		{
			System.out.println("rich ");
		}

		else if( Salary ==100000)
		{
			System.out.println("middle");

		}


		else if(Salary>10000 && Salary<50000)
		{
			System.out.println("poor");

		}

		else if(Salary<10000)
		{
			System.out.println("bpl");
		}
		else {
			System.out.println("else ");
		}
	
	}	

	public static void main(String[] args) {
		People richpeople=new People();
		richpeople.salary(100000);

//		People middlepeople=new People();
//		middlepeople.salary(70000);
//
//		People poorpeople=new People();
//		poorpeople.salary(25000);
//
//		People bplpeople=new People();
//		bplpeople.salary(5000);




	}


}


