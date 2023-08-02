package com.xworkz.four.app;

public class SmartWatch extends Watch {

	public double batteryLevel ;
	public boolean isCharging;

	public SmartWatch() {
		System.out.println("invocking no-args in SmartWatch");
	}

	public void display() {
		System.out.println("invocking display");
	}
}
