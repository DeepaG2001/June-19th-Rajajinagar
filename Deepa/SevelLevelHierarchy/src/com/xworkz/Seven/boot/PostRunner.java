package com.xworkz.Seven.boot;

import com.xworkz.Seven.app.Computer;

public class PostRunner {

	public static void main(String[] args) {
		System.out.println("invocking main in PostRunner");

		Computer computer = new Computer();
		System.out.println(computer.manfDate);
		System.out.println(computer.quantity);
		System.out.println(computer.price);
		System.out.println(computer.brand);
		System.out.println(computer.size);
		System.out.println(computer.yearOfInvent);

		computer.call();
		computer.write();
		computer.chating();
		computer.dailing();
		computer.floder();
		computer.store();

	}
}