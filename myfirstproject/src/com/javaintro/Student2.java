package com.javaintro;

public class Student2 {
	 int id;
		{
			count++;
			id=count;
		}
		static int count =100;

	public static void main(String[] args) {
		System.out.println("main method started ");
		Student2 sahiti=new Student2();
		System.out.println(sahiti.id);
		Student2 akhil=new Student2();
		System.out.println(akhil.id);
		
		System.out.println(sahiti.id);
		

	}

}
