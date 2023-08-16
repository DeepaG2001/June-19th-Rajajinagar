package com.xworkz.good.app;

public class Logo {

	private String name;
	private int size;
	private long year;
	private String color;
	private String date;
	
	
	public Logo() {
		super();
		System.out.println("invocking no args in logo");
	}


	public Logo(String name, int size, long year, String color, String date) {
		super();
		System.out.println("invocking logo");
		this.name = name;
		this.size = size;
		this.year = year;
		this.color = color;
		this.date = date;
	}
	@Override
	public String toString() {
		
		return ("Name:"+this.name +"Size:"+this.size +"Year:"+this.year +"Color:"+this.color +"Date:"+this.date);
	}
	
}
