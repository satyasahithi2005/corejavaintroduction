package com.javaintro.garbage;

public class ObjectInsideMethod {
	static int stdId;
	 static String stdName;
	 static void method() {
		 ObjectInsideMethod o=new ObjectInsideMethod();
		 System.out.println(o);
		 System.out.println(o.hashCode());
		 int a=0x2b2fa4f7;
		 System.out.println(a);
		 
		 stdId=1;
		 stdName="sahithi";
		 System.out.println(stdId);
		 System.out.println(stdName);
	 }
	 @Override
		protected void finalize(){
			System.out.println("object is destroyed");
			
		}

	public static void main(String[] args) {
System.out.println("main method started");
		 method();
		System.gc();
		

	}

}
