package com.xworkz.four.app;

public class Clock extends HourGlass {

	public boolean isTicking ;
	public boolean isAm;

	public Clock() {
		System.out.println("invocking no-args in clock");
	}

	public void time() {
		System.out.println("invocking time");
	}

}
