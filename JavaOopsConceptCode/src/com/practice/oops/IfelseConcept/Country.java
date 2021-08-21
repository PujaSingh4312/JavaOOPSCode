package com.practice.oops.IfelseConcept;

public class Country {
	
	public void economy(int currency)
	{
		if(currency>50 && currency<80);
		{
			System.out.println("developed country");
		}
	
		else if (currency<50 )
        {
        	System.out.println("developing country");
        }
        
	}
	
	public static void main(String[] args) {
		
		Country america=new Country();
		america.economy(70);
		
		Country japan=new Country();
		japan.economy(40);
	}
	}



