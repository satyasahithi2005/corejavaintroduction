package com.javaintro;

public class Bank {
	static int serial=123560;
	{
		serial++;
		accno=serial;
	}

	int accno;
	String name;
	int balance;
	int mobile;
	void display() {
		
		System.out.println(accno);
		System.out.println(name);
		System.out.println(balance);
		System.out.println(mobile);
	}

	public static void main(String[] args) {
		Bank b1=new Bank();
		b1.name="sahithi";
		b1.balance=1200;
		b1.mobile=739682858;
		b1.display();
		Bank b2=new Bank();
		b2.name="jeevan";
		b2.balance=1300;
		b2.mobile=234567;
		b2.display();
		
	

	}

}
