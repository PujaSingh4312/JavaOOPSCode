package com.practice.oops.DataHiding;

public class DataHidingPractice1 {
	
	private int dataMember;
	
	public void setDataMember(int dataMember) {
		this.dataMember=dataMember;
	}

	public int getDataMember() {
		return dataMember;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataHidingPractice1 d1=new DataHidingPractice1();
		d1.setDataMember(20);
		int dm = d1.getDataMember();
		
		System.out.println(dm);

	}

}
