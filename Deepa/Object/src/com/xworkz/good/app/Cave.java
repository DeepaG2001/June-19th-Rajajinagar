package com.xworkz.good.app;

public class Cave {

	private double temperature;
	private int humidity;
	private boolean isExplored;
	private boolean isDark;
	private boolean hasWaterSource;
	private boolean hasBats;
	private int noOfPeople;
	private boolean isHarmfullAnimal;
	private String location;
	private double distance;
	
	public Cave() {
		super();
		System.out.println("invocking no args in cave");
	}

	public Cave(double temperature, int humidity, boolean isExplored, boolean isDark, boolean hasWaterSource,
			boolean hasBats, int noOfPeople, boolean isHarmfullAnimal, String location, double distance) {
		super();
		System.out.println("invocking cave");
		this.temperature = temperature;
		this.humidity = humidity;
		this.isExplored = isExplored;
		this.isDark = isDark;
		this.hasWaterSource = hasWaterSource;
		this.hasBats = hasBats;
		this.noOfPeople = noOfPeople;
		this.isHarmfullAnimal = isHarmfullAnimal;
		this.location = location;
		this.distance = distance;
	}
	
	@Override
	public String toString() {
		
		return ("Temperature:"+this.temperature+"Humidity"+this.humidity+"Distance:"+this.distance+"Explored:"+this.isExplored+
				"Dark:"+this.isDark+"WaterSource:"+this.hasWaterSource+"Bats:"+this.hasBats+"People:"+this.noOfPeople
				+"Harmfull:"+this.isHarmfullAnimal+"Location:"+this.location+"Distance:"+this.distance);
	}
}
