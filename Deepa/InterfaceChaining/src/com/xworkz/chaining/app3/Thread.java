package com.xworkz.chaining.app3;

public class Thread extends Rope {

	public Thread()  {

		super("Fiber", 5, 200, true);

		System.out.println("invocking no-args in thread");

	}

	public Thread(String material, int quantity, double price, boolean using) {
		super(material, quantity, price, using);
		System.out.println("invocking String ,int ,double ,boolean ");

	}

}
