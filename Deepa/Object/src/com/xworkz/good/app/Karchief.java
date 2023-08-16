package com.xworkz.good.app;

public class Karchief {

	private String material;
	private double price;
	private int quantity;
	private String color;
	private char size;
	private int length;
	private boolean qualityGood;
	
	public Karchief(String material, double price, int quantity, String color, char size, int length,
			boolean qualityGood) {
		super();
		this.material = material;
		this.price = price;
		this.quantity = quantity;
		this.color = color;
		this.size = size;
		this.length = length;
		this.qualityGood = qualityGood;
	}

	public Karchief() {
		super();
	}
	@Override
	public String toString() {
		
		return ("Cotton :" +this.material+"Price:"+this.price +"Quantity:"+this.quantity +
		"Color:"+this.color+"Size:"+this.size +"Length:"+this.length +"Quality Good:"+this.qualityGood); 
	}
	
	
}
