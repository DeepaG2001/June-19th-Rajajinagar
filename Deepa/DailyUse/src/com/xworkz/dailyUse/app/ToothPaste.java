package com.xworkz.dailyUse.app;

public class ToothPaste {

	public String name;
	public String brand;
	public Ingredent[] ingredent;
	
	public Company company = new Company("infosys","abc","india");
	
	
	public ToothPaste(String name,String brand,Ingredent[] ingredent)
	{
		this.name = name;
		this.brand = brand;
		this.ingredent = ingredent;
		
		
	}
	public void printInfo()
	{
		System.out.println("invoking printInfo statements");
		System.out.println("name: "+this.name);
		System.out.println("brand: "+this.brand);
		
		for(int i=0;i<this.ingredent.length;i++)
		{
			Ingredent ref = this.ingredent[i];
			ref.printInfo();
		}
	}
	
}
