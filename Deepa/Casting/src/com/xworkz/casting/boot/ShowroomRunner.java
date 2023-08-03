package com.xworkz.casting.boot;

import com.xworkz.casting.app.Showroom;
import com.xworkz.casting.app.util.ShowroomUtil;
import com.xworkz.casting.app.WatchShowroom;
import com.xworkz.casting.app.MobileShowroom;

public class ShowroomRunner {

	public static void main(String[] args) {
		System.out.println("invocking main in ShowroomRunner");
		
		Showroom showroom=new Showroom();
		
		WatchShowroom watchShowroom=new WatchShowroom();
		MobileShowroom mobileShowroom=new MobileShowroom();
		
		ShowroomUtil.run(showroom);
		ShowroomUtil.run(watchShowroom);
		ShowroomUtil.run(mobileShowroom);
	}
}
