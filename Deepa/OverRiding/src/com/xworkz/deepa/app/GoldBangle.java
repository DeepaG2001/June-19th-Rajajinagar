package com.xworkz.deepa.app;

public class GoldBangle extends Bangle {

	@Override
	public void sound()
	{
	   System.out.println("invocking no arg in Bangle");
	}

	public boolean broken()
	{
	 System.out.println("invocking broken in Bangle");
	 return false;

	}
}
