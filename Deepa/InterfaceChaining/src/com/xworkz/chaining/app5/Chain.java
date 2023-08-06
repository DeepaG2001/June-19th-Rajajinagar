package com.xworkz.chaining.app5;

public class Chain extends Gold {

	public Chain() {
		super("Malbar", "Chikpete", true, 29000);

		System.out.println("invocking no-args in Chain");
	}

	public Chain(String shopName,String location,boolean qultgood,double price)
	{
		super(location, shopName, qultgood, price);
		System.out.println("invocking String ,String ,double ,boolean ");
	}
}
