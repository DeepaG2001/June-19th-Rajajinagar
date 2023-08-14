package com.xworkz.mall.app;

public  class ShoppingMall extends Mall {

	@Override
	public void shop()
	{
		System.out.println("Shop in ShoppingMall");
	}
	@Override
	public boolean open()
	{
		System.out.println("open in ShoppingMall");
		return true;
	}
	@Override
	public boolean cafeteria()
	{
		System.out.println("cafeteria in ShoppingMall");
		return true;
	}
	@Override
	public void elevator() 
	{
		System.out.println("elevator in ShoppingMall");
	}
	@Override
	public boolean parking()
	{
		System.out.println("parking in ShoppingMall");
		return false;
	}
	@Override
	public  boolean security() {
		System.out.println("security in  ShoppingMall");
		return false;
		
	}

	@Override
	public  void location() {
		System.out.println("location in ShoppingMall");
	}
	
	@Override
	public  int noOfStores() {
		System.out.println("noOfStores in ShoppingMall");
		return 10;
	}
	
	@Override
	public  int noOfFloors() {
		System.out.println("noOfFloors in ShoppingMall");
		return 10;
	}
	
	@Override
	public   void name() {
		System.out.println("name in ShoppingMall");
	}
}
