package com.xworkz.Two.app;

public class Fan extends WindMill{

	public boolean oscillation ;
	public int speedLevel;

	public  Fan()
		{
			System.out.println("invocking no-args in WindMill");
		}

	public void wind() {
		System.out.println("invocking wind");
	}

}
