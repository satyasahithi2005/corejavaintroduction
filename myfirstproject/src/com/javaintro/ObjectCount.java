package com.javaintro;

public class ObjectCount {
	static int count=0;
	{
		count=count+1;
	}
		

	public static void main(String[] args) {
		System.out.println("main method started ");
		ObjectCount oc=new ObjectCount();
		
		ObjectCount oc1=new ObjectCount();
		ObjectCount oc2=new ObjectCount();
		
		System.out.println(count);

		ObjectCount oc3=new ObjectCount();
		ObjectCount oc4=new ObjectCount();

		System.out.println(count);
		
		
		
		

	}

}
