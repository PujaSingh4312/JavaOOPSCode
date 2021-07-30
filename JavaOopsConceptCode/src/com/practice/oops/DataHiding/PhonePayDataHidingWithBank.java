package com.practice.oops.DataHiding;

public class PhonePayDataHidingWithBank {

	public static void main(String[] args) {
		BankDataHidingExample bank = new BankDataHidingExample();
		int balance = bank.getBalance();
		System.out.println(balance);
		
	}
}
