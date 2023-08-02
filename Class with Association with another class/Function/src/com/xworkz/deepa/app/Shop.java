package com.xworkz.deepa.app;

public class Shop {


	
	public String shopCategory = "Chats";
	public int noOfItems = 100;
	public SalesMan man = new SalesMan();
	
	
	public void calling()
	{
		System.out.println("invoking calling in shop");
		this.man.productSale();
	}
	

	public void feedBack()
	{
		System.out.println("invoking feedBack in shop");
	}
}
