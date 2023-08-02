package com.xworkz.Two.boot;

import com.xworkz.Two.app.*;

public class AirRunner {

	public static void main(String[] args) {
		System.out.println("invocking main in AirRunner");
	
		Fan fan=new Fan();
		System.out.println(fan.oscillation);
		System.out.println(fan.speedLevel);
		System.out.println(fan.bladeLength);
		System.out.println(fan.direction);
		System.out.println(fan.pressure);
		System.out.println(fan.humidity);
		fan.wind();
		fan.powerGeneration();
		fan.living();
	}
}

