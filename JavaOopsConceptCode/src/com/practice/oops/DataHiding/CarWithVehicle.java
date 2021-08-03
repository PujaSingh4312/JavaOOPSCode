package com.practice.oops.DataHiding;

public class CarWithVehicle extends Vehicle{
	
	public void carmodel()
	{
	    System.out.println("maruti has 4 wheels");
	}
	

	public static void main(String[] args) {
		
		CarWithVehicle c=new CarWithVehicle();
		c.carmodel();
		c.wheel();
				
				
		

	}

}
