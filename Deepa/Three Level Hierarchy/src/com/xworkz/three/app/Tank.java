package com.xworkz.three.app;

public class Tank extends Ocean {

	public boolean isLeaking;
	public String material;

	public Tank() {
		System.out.println("invocking no-args in Tank");
	}

	public void store() {
		System.out.println("invocking Store");
	}

}
