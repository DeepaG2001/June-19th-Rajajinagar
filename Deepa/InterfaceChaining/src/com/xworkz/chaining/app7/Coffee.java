package com.xworkz.chaining.app7;

public class Coffee {

	public String type;
	public String shopName ;
	public double price;
	public int noOfCup;
	
	public Coffee(String type,String shopName,int noOfCup ,double price)
	{
		
		System.out.println("invocking Daimond ");
		this.type=type;
		this.shopName=shopName;
		this.noOfCup=noOfCup;
		this.price=price;
		
	}
}

