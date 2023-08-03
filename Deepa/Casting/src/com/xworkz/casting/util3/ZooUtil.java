package com.xworkz.casting.util3;

import com.xworkz.casting.app3.*;

public class ZooUtil {
	public static void run(Zoo zoo) {

		System.out.println(zoo.open);
		zoo.show();

		if (zoo instanceof StateZoo) 
		{
			System.out.println("zoo is StateZoo");

			StateZoo stateZoo = (StateZoo) zoo;
			System.out.println(stateZoo.name);
			stateZoo.cage();
		}
		
		if (zoo instanceof NationalZoo) {
			System.out.println("zoo is nationalzoo");

			NationalZoo nationalZoo = (NationalZoo) zoo;
			System.out.println(nationalZoo.location);
			nationalZoo.visitors();
		
		}
	}
}
