package com.xworkz.chaining.app7;

public class FilterCoffee extends Coffee {

	public FilterCoffee() {
		super("BlackCoffee", "Malgudi", 50, 2);

		System.out.println("invocking no-args in neckpeice");
	}

	public FilterCoffee(String type,String shopName,int noOfCup ,double price)
	{
		super(shopName, type, noOfCup, price);
		System.out.println("invocking String ,String ,double ,boolean ");
	}
}
