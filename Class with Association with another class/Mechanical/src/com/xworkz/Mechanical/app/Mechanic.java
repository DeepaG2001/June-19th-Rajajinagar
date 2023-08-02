package com.xworkz.Mechanical.app;

public class Mechanic {

	public String qualification;
	public  double experience;
	
	public void repair()
	{
		System.out.println("invocking repait in Mechanic");
		System.out.println(this.qualification);
		System.out.println(this.experience);
	}
	
	public void washingVehical()
	
	{
		System.out.println("invocking washingVehical in Mechanic");
	}
}
