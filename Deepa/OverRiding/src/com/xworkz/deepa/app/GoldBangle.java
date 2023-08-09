package com.xworkz.deepa.app;

public class GoldBangle extends Bangle {

	@Override
	public void sound()
	{
	   System.out.println("invocking no arg in Bangle");
	   super.broken();
	   this.broken();
	}
	@Override
	public boolean broken()
	{
		System.out.println("invocking broken this in Bangle");
		return false;
		
	}
 
	
}
