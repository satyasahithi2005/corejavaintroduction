package com.javaintro;

public class Product {
	static String storeName="VIJETHA";
	int productId;
	String productName;
	int productPrice;
	void details() {
		System.out.println(storeName);
		System.out.println(productId);
		System.out.println(productName);
		System.out.println(productPrice);
	}

	public static void main(String[] args) {
		Product p=new Product();
		p.productId=1;
		p.productName="biscuits";
		p.productPrice=50;
		p.details();
		Product p1=new Product();
		p1.productId=2;
		p1.productName="chocolates";
		p1.productPrice=100;
		p1.details();
		Product p2=new Product();
		p2.productId=2;
		p2.productName="pastry's";
		p2.productPrice=100;
		p2.details();
		
		

	}

}
