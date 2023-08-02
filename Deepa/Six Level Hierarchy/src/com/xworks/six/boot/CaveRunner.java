package com.xworks.six.boot;

import com.xworks.six.app.Mall;

public class CaveRunner {

	public static void main(String[] args) {
		System.out.println("invocking main in CaveRunner");
	
		Mall mall=new Mall();
		System.out.println(mall.floor);
		System.out.println(mall.floorNo);
		System.out.println(mall.length);
		System.out.println(mall.name);
		System.out.println(mall.number);
		System.out.println(mall.width);
	
		mall.shelter();
		mall.clean();
		mall.accomodate();
		mall.stay();
		mall.lift();
		mall.shop();
	}
}
