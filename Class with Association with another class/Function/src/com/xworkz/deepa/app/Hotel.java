package com.xworkz.deepa.app;

public class Hotel {

	public String name = "Pooja";
	public int rating = 4;
	public Cook cook = new Cook();
	
	
	public void foodService()
	{
		System.out.println("invoking foodService in Hotel");
		this.cook.prepareFood();
	}
	
	public void bestfood()
	{
		System.out.println("invoking bestfood in hotel");
	}
}
