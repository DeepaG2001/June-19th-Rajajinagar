package com.xworkz.five.app;

public class Bicycle extends Wheel{

	public boolean isRiding ;
	public int gears;

	public Bicycle() {
		System.out.println("invocking no-args in Bicycle");
	}

	public void run() {
		System.out.println("invocking run");
	}
}
