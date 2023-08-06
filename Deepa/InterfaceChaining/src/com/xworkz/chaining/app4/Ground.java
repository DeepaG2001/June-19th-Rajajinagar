package com.xworkz.chaining.app4;

public class Ground {

	public String location;
	public String gameName ;
	public long noOfPeople;
	public boolean open;
	
	public Ground(String location,String gameName,long noOfPeople,boolean open)
	{
		
		System.out.println("invocking Ground ");
		this.location=location;
		this.gameName=gameName;
		this.noOfPeople=noOfPeople;
		this.open=open;
		
		
	}
}
