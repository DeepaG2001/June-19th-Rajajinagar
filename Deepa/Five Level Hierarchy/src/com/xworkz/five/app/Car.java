package com.xworkz.five.app;

public class Car extends MotorVehical {

	public int year ;
	public String model;

	public Car() {
		System.out.println("invocking no-args in Car");
	}

	public void travel() {
		System.out.println("invocking travel");
	}
}
