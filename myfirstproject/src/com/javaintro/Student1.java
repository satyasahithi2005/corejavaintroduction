package com.javaintro;

public class Student1 {
	void data() {
		int id=1;
		String name="sahithi";
		int marks=100;
		System.out.println("student id:"+id);
		System.out.println("student name:"+name);
		System.out.println("student marks:"+marks);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Student1 s=new Student1();
		s.data();
		

	}

}
