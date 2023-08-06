package com.xworkz.chaining.boot;

import com.xworkz.chaining.app2.Wifi;

public class RouterRunner {

	public static void main(String[] args) {

		System.out.println("invocking in main RouterRunner");

		Wifi wiFi = new Wifi();
		System.out.println(wiFi.ipAddress);
		System.out.println(wiFi.channel);
		System.out.println(wiFi.price);
		System.out.println(wiFi.quantity);

		Wifi wiFi1 = new Wifi(2,"20ASpp500",209.12,2);
		System.out.println(wiFi1.ipAddress);
		System.out.println(wiFi1.channel);
		System.out.println(wiFi1.price);
		System.out.println(wiFi1.quantity);

	}

}
