package com.xworkz.deepa.boot;

import com.xworkz.deepa.app.*;

public class HotelRunner {

	  public static void main(String[] args) 
		{

			System.out.println("invoking main in HotelRunner");
			
			Hotel hotel = new Hotel();
			System.out.println("name:"+hotel.name);
			System.out.println("ratings:"+hotel.rating);
			
			Cook cook = hotel.cook;
			System.out.println("name:"+cook.name);
			System.out.println("item:"+cook.item);
			
			hotel.foodService();
			hotel.eat();
 }
}