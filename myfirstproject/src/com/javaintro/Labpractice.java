package com.javaintro;

public class Labpractice {
	static {
		m1();
	}
	static void m1() {
		
		System.out.println("method1 is called");
		Labpractice l1=new Labpractice();
		l1.m2();
		l1.m3();
		}
	void m2() {
		System.out.println("method2 is called");
	}		
		void m3() {
		System.out.println("method3 is called");
	}
	

	

	public static void main(String[] args) {
		System.out.println("main method started");
		

	}

}
