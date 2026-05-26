package com.javaintro;

public class Student {
	int stno;
	int stAge;
	String stName;
	static String schoolName;
	static String schoolAddress;

	public static void main(String[] args) {
		System.out.println("main method started!!");
		System.out.println("Student Details... ");
		System.out.println("object1*****");
		schoolName="Sanskriti Vidhya Mandir";
		schoolAddress="Kanchikacherla";
		Student sah=new Student();
		sah.stno=1;
		sah.stAge=21;
		sah.stName="Sahithi";
		System.out.println("SchoolName:"+schoolName);
		System.out.println("SchoolAddress:"+schoolAddress);
		System.out.println("StudentNumber:"+sah.stno);
		System.out.println("StudentAge:"+sah.stAge);
		System.out.println("StudentName:"+sah.stName);
		System.out.println("object2*****");
		System.out.println("********************");
		Student sai=new Student();
		sai.stno=2;
		sai.stAge=19;
		sai.stName="SaiJeevan";
		System.out.println("SchoolName:"+schoolName);
		System.out.println("SchoolAddress:"+schoolAddress);
		System.out.println("StudentNumber:"+sai.stno);
		System.out.println("StudentAge:"+sai.stAge);
		System.out.println("StudentName:"+sai.stName);
		System.out.println("********************");
		System.out.println("object3*****");
		schoolName="Delhi Public School";
		schoolAddress="Vijayawada";
		System.out.println("SchoolName:"+schoolName);
		System.out.println("SchoolAddress:"+schoolAddress);
		Student akh =new Student();
		akh.stno=1;
		akh.stAge=21;
		akh.stName="Akhil";
		System.out.println("StudentNumber:"+akh.stno);
		System.out.println("StudentAge:"+akh.stAge);
		System.out.println("StudentName:"+akh.stName);
		
		
		
		
		
		

	}

}
