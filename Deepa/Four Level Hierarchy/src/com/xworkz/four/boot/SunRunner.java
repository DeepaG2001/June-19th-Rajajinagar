package com.xworkz.four.boot;

import com.xworkz.four.app.SmartWatch;

public class SunRunner {

	public static void main(String[] args) {
		System.out.println("invocking main in AirRunner");
	
		SmartWatch smartWatch=new SmartWatch();
		System.out.println(smartWatch.temperature);
		System.out.println(smartWatch.batteryLevel);
		System.out.println(smartWatch.isCharging);
		System.out.println(smartWatch.isDigital);
		System.out.println(smartWatch.isAlaramSet);
		System.out.println(smartWatch.isFlipped);
		System.out.println(smartWatch.sandCapacity);
		System.out.println(smartWatch.isTicking);
		System.out.println(smartWatch.sandCapacity);
		System.out.println(smartWatch.radius);
		smartWatch.time();
		smartWatch.time1();
		smartWatch.glass();
		smartWatch.display();
		smartWatch.light();
		
	}
}
