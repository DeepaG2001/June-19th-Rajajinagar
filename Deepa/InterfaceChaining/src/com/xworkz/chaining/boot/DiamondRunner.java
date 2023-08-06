package com.xworkz.chaining.boot;

import com.xworkz.chaining.app6.*;

public class DiamondRunner {

	public static void main(String[] args) {
		System.out.println("invocking in main DiamondRunner");
		
		NeckPeice neckPeice=new NeckPeice();
		System.out.println(neckPeice.type);
		System.out.println(neckPeice.location);
		System.out.println(neckPeice.price);
		System.out.println(neckPeice.good);
			
		NeckPeice neckPeice1=new NeckPeice("kolar","original",false,5080);
		System.out.println(neckPeice1.type);
		System.out.println(neckPeice1.location);
		System.out.println(neckPeice1.price);
		System.out.println(neckPeice1.good);
			
   }
}