package com.xworkz.deepa.boot;

import com.xworkz.deepa.app.IronBox;
public class MetalRunner {

	public static void main(String[] args) {
		System.out.println("invocking main in  MetalRunner ");
		
		IronBox box=new IronBox();
		System.out.println(box.working);
		System.out.println(box.quantity);
		System.out.println(box.price);
		System.out.println(box.quantity1);
		box.ironing();
		box.manufacture();
	}
}
