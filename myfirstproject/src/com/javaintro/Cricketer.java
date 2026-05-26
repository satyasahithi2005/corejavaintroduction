package com.javaintro;

public class Cricketer {
	int jno;
	String name;
	static int countryId;
	static String countryName;

	public static void main(String[] args) {
		System.out.println("main method started!!");
		System.out.println("Indian Cricket team");
		countryId=91;
		countryName="India";
		System.out.println(countryId);
		System.out.println(countryName);
		
		Cricketer msd=new Cricketer();
		msd.jno=7;
		msd.name="mahendra singh dhoni";
		System.out.println(msd.jno);
		System.out.println(msd.name);
		

	}

}
