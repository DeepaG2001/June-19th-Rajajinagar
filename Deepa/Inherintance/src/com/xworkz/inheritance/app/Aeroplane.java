package com.xworkz.inheritance.app;

public class Aeroplane extends FlyingMachine {

	String company="Air Bus";
			
	public Aeroplane()
	{
		System.out.println("no-agrs const of aeroplane");
	}
	
	public void bookTicket()
	{
		System.out.println("invocking bookTicket");
	}
}
