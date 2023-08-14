package com.xworkz.mall.boot;

import com.xworkz.mall.app.Mall;
import com.xworkz.mall.app.ShoppingMall;

public  class MallRunner {

	public static void main(String[] args) {
		System.out.println("invocking main in MallRunner");
		
		Mall ref=new ShoppingMall();
		ref.cafeteria();
		ref.elevator();
		ref.location();
		ref.name();
		ref.noOfFloors();
		ref.shop();
		ref.noOfStores();
		ref.security();
		ref.open();
		ref.parking();
	}

}
