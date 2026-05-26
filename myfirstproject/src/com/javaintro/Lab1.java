package com.javaintro;

public class Lab1 {
	void m1() {
		System.out.println("hello, good morning!");
		}
	void m2() {
		System.out.println("method2 is called ");
	    }
	
	static void m3() {
		
		System.out.println("static method is called");
		 Lab1 l1=new Lab1();
		l1.m1();
		l1.m2();
		
		}

	public static void main(String[] args) {
		System.out.println("main method started ");
		m3();
		System.out.println("main method ended");

	}

}
