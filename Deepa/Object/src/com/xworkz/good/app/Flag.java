package com.xworkz.good.app;

public class Flag {

	private String countryName;
	private String material;
	private String color;
	
	public Flag() {
		super();
		System.out.println("invocking no args in flag");
	}

	public Flag(String countryName, String material, String color) {
		super();
		System.out.println("invocking Flag");
		this.countryName = countryName;
		this.material = material;
		this.color = color;
	}
	@Override
	public String toString() {
		
		return "Name:"+this.countryName +"Material:"+this.material +"Color: "+this.color;
	}
	
}
