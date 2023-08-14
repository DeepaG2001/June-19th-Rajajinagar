package com.xworkz.mall.app;

public abstract class Mall {

	public void shop()
	{
		
	}
	public boolean open()
	{
		return true;
	}
	public boolean cafeteria()
	{
		return true;
	}
	public void elevator() 
	{
		
	}
	public boolean parking()
	{
		return false;
	}
	public abstract boolean security();

	public abstract void location();
	
	public abstract int noOfStores();
	
	public abstract int noOfFloors();
	
	public abstract  void name();
}
