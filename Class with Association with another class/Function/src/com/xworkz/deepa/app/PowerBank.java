package com.xworkz.deepa.app;

public class PowerBank {

	public  int range = 400;
	public  String brandName ="Noise" ;
	public Battery battery = new Battery();
	
	public void controlPower()
	{
		System.out.println("invoking control power in powerbank");
		this.battery.store();
	}
	
	public void charge()
	{
		System.out.println("invoking charge in powerank");
	}

}
