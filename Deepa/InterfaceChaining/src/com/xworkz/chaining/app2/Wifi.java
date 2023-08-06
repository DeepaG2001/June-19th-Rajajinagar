package com.xworkz.chaining.app2;

public class Wifi extends Router {

	public Wifi() {
		super(3, "247gp3", 589, 2);
		System.out.println("invocking no-args in const");
	

	}

	public Wifi(int channel, String ipAddress, double price, int quantity)
	{
		super( channel,  ipAddress,  price,  quantity);
		System.out.println("invocking String ,int ,double ,int,int ");
	}

	
}
