package com.xworkz.three.boot;

import com.xworkz.three.app.*;

public class WaterRunner {

	public static void main(String[] args) {
		System.out.println("invocking main in AirRunner");
	
		Bottel bottel=new Bottel();
		System.out.println(bottel.botteleCapacity);
		System.out.println(bottel.isCold);
		System.out.println(bottel.isLeaking);
		System.out.println(bottel.isSealed);
		System.out.println(bottel.material);
		System.out.println(bottel.noMarinelife);
		System.out.println(bottel.oceanName);
		System.out.println(bottel.tempertaure);
		bottel.storing();
		bottel.store();
		bottel.drinking();
		bottel.nature();
		
	}
}
