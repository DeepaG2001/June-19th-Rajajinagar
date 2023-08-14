package com.xworkz.mall.boot;

import com.xworkz.mall.app.HouseSite;
import com.xworkz.mall.app.Site;

public  class SiteRunner {

	public static void main(String[] args) {
		System.out.println("invocking main in SitezRunner");
		
		Site ref =new HouseSite();
		ref.amount();
		ref.area();
		ref.design();
		ref.interiorDesign();
		ref.location();
		ref.nearToCity();
		ref.rent();
		ref.plan();
		ref.parameter();
		ref.noOfFloors();
		
		
	}
}
