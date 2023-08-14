package com.xworkz.mall.app;

public abstract class Site {

	public void design() {
		System.out.println("design in site");
	}

	public void plan() {
		System.out.println("plan in site");
	}

	public void area() {
		System.out.println("area in site");
	}

	public void amount() {
		System.out.println("amount in site");
	}

	public void location() {
		System.out.println("location in site");
	}

	public abstract void parameter();

	public abstract boolean nearToCity();

	public abstract int noOfFloors();

	public abstract boolean interiorDesign();

	public abstract double rent();

}
