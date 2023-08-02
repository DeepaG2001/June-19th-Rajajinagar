package com.xworkz.inheritance.app;

import com.xworkz.inheritance.app.Aeroplane;

public class FlyingMachineRunner {

	public static void main(String[] args) {
		
		System.out.println("invockinf main in FlyingMachineRunner");
		
		Aeroplane aeroplane=new Aeroplane();
		System.out.println(aeroplane.material);
		aeroplane.fly();
		
		
	}

}
