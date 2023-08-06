package com.xworkz.chaining.app6;

public class NeckPeice extends Diamond {

	public NeckPeice() {
		super("PureDiamond", "kolar", true, 50900);

		System.out.println("invocking no-args in neckpeice");
	}

	public NeckPeice(String type,String location,boolean good,double price)
	{
		super(location, type, good, price);
		System.out.println("invocking String ,String ,double ,boolean ");
	}
}
