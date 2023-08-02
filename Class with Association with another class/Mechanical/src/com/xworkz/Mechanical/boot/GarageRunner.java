package com.xworkz.Mechanical.boot;

import com.xworkz.Mechanical.app.Garage;

public class GarageRunner {

	public static void main(String[] args) {
		
	System.out.println("invocking main in GarageRunner");	
	
	Garage garage=new Garage();
	garage.service();
	garage.wash();
	
		
		
		
	}
}
