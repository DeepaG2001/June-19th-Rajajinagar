package com.xworkz.mall.app;

public  class HouseSite extends Site {

	
	@Override
	public void design() {
		System.out.println("design in HouseSite");
	}
	@Override
	public void plan() {
		System.out.println("plan in HouseSite");
	}
	@Override
	public void area() {
		System.out.println("area in HouseSite");
	}
	@Override
	public void amount() {
		System.out.println("amount in HouseSite");
	}
	@Override
	public void location() {
		System.out.println("location in HouseSite");
	}
	@Override
	public void parameter() {
		System.out.println("parameetr in HouseSite");
	}
	@Override
	public boolean nearToCity() {
		System.out.println("nearToCity in HouseSite");
		return false;

	}
	@Override
	public int noOfFloors() {
		System.out.println("noOfFloors in HouseSite");
		return 5;

	}
	@Override
	public boolean interiorDesign() {
		System.out.println("interiorDesign in HouseSite");
		return true;

	}
	@Override
	public double rent() {
		System.out.println("rent in HouseSite");
		return 10000;

	}

}
