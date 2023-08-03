package com.xworkz.casting.boot;

import com.xworkz.casting.app3.*;
import com.xworkz.casting.util3.ZooUtil;

public class ZooRunner {

	public static void main(String[] args) {

		System.out.println("invocking main in ZooRunner");

		Zoo zoo = new Zoo();

		StateZoo stateZoo = new StateZoo();
		NationalZoo nationalZoo = new NationalZoo();

		ZooUtil.run(zoo);
		ZooUtil.run(stateZoo);
		ZooUtil.run(nationalZoo);
	}

}
