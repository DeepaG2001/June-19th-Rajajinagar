package com.xworkz.deepa.app;

public class Browser {

	public  String address = "web";
	public String name ="google";
	public Internet internet = new Internet();
	
	public void search()
	{
		System.out.println("invoking search in browser");
		this.internet.search();
	}
	public void retrieve()
	{
	   System.out.println("invoking retrieve in browser");
	}
	
}
