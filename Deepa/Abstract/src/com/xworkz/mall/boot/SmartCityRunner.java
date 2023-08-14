package com.xworkz.mall.boot;

import com.xworkz.mall.app.Development;
import com.xworkz.mall.app.SmartCity;

public class SmartCityRunner {

	public static void main(String[] args) {
		System.out.println("invocking main in SmartCityRunner");
		
		SmartCity ref =new Development();
		ref.afforestation();
		ref.ccTv();
		ref.greenSpace();
		ref.noise();
		ref.security();
		ref.smartLight();
		ref.temperature();
		ref.traffic();
		ref.transport();
		ref.wasteMang();
		
	}
}
