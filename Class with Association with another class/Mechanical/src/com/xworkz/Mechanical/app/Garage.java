package com.xworkz.Mechanical.app;

public class Garage {

	public String name;
	public String location;
	public Mechanic mechanic;
	
	public void service()
	{
		System.out.println("invocking serive in Garage");
		
		if (this.mechanic!=null)
		{
		this.mechanic.repair();
     	}
		else
		{
			System.err.println("Machanic in null, cannot invocke the method service ");
		}
	}
	public void wash()
	{
		System.out.println("invocking wash in Garage");
		
		if (this.mechanic!=null)
		{
		this.mechanic.washingVehical();
	    }
		else
		{
			System.err.println("Mechanic is null, cannot invocke the method wash");
		}
	}
	public void printInfo()
	{
		System.out.println("invocing printInfo of Garage");
		System.out.println("Name:"+this.name);
		System.out.println("Location:"+this.location);
		System.out.println("Mechanic:"+this.mechanic);
	}
}