package com.xworkz.chaining.boot;

import com.xworkz.chaining.app5.Chain;

public class GoldRunner {

	public static void main(String[] args) {
		System.out.println("invocking in main GoldRunner");
		
		Chain chain=new Chain();
		System.out.println(chain.shopName);
		System.out.println(chain.location);
		System.out.println(chain.price);
		System.out.println(chain.qultgood);
			
			
		Chain chain1=new Chain("kalyan", "Bangalur",true, 29000);
		System.out.println(chain1.shopName);
		System.out.println(chain1.location);
		System.out.println(chain1.price);
		System.out.println(chain1.qultgood);
			
	}
}
