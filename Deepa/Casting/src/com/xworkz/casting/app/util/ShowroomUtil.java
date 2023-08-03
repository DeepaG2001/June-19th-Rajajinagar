package com.xworkz.casting.app.util;

import com.xworkz.casting.app.*;
import com.xworkz.casting.app.WatchShowroom;

public class ShowroomUtil extends Showroom {

	public static void run(Showroom showroom) {

		System.out.println(showroom.location);
		showroom.sell();
//avoid class cast exception
		if (showroom instanceof WatchShowroom) // prent ref to child ref
		{
			System.out.println("showroom is watch");

			WatchShowroom watchShowroom = (WatchShowroom) showroom;// casting
			System.out.println(watchShowroom.since);
			watchShowroom.discount();
		}
		
		if (showroom instanceof MobileShowroom) {
			System.out.println("showroom is watch");

			MobileShowroom mobileShowroom = (MobileShowroom) showroom;
			System.out.println(mobileShowroom.pincode);
			mobileShowroom.freeGift();
		}
	}
}
