package com.xworkz.five.boot;

import com.xworkz.five.app.Bus;

public class WheelRunner {

	public static void main(String[] args) {
		System.out.println("invocking main in AirRunner");
	
		Bus bus=new Bus();
		System.out.println(bus.busNo);
		System.out.println(bus.driverName);
		System.out.println(bus.year);
		System.out.println(bus.model);
		System.out.println(bus.engineCapacity);
		System.out.println(bus.manufacture);
		System.out.println(bus.model);
		System.out.println(bus.isRiding);
		System.out.println(bus.isFlat);
		System.out.println(bus.gears);
		System.out.println(bus.noOfWheel);
		
		bus.transport();
		bus.travel();
		bus.run();
		bus.race();
 }
}
