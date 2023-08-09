package com.xworkz.deepa.app;

public class RailwayGate extends Gate {

	@Override
	public boolean open()
	{
		System.out.println("invocking open in RailwayGate");
		return false;
		
	}
}
