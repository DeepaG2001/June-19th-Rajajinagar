package com.xworkz.casting.boot;

import com.xworkz.casting.app4.*;
import com.xworkz.casting.util4.BrandUtil;

public class BrandRunner {

	public static void main(String[] args) {

		System.out.println("invocking main in BrandRunner");

		Brand brand = new Brand();

		LocalBrand localBrand = new LocalBrand();
		NationalBrand nationalBrand = new NationalBrand();
		DuplicateBrand duplicateBrand=new DuplicateBrand();
		InternationalBrand internationalBrand=new InternationalBrand();
		

		BrandUtil.run(brand);
		BrandUtil.run(localBrand);
		BrandUtil.run(nationalBrand);
		BrandUtil.run(duplicateBrand);
		BrandUtil.run(internationalBrand);
		
	}
}
