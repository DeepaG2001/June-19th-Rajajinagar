package com.xworkz.dailyUse.app;

public class Area {

	public String name;
	public Coporator corporator=new Coporator("Santhosh");
	public Area(String name)
	{
		System.out.println("Invoking string constructor in Area");
		this.name=name;
	}
	public void printInfo() {
		System.out.println("\n");
		System.out.println("Name of the area is "+this.name);
		corporator.printInfo();
		
	}
	
	
}