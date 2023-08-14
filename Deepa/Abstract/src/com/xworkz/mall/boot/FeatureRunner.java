package com.xworkz.mall.boot;

import com.xworkz.mall.app.Feature;
import com.xworkz.mall.app.UpComming;

public class FeatureRunner {

	public static void main(String[] args) {
		System.out.println("invocking main in Featurerunner");
		
		Feature ref =new UpComming();
		ref.car();
		ref.cloths();
		ref.flat();
		ref.goodLife();
		ref.goodPosition();
		ref.goodSkill();
		ref.iPhone();
		ref.job();
		ref.watch();
		ref.marriage();
	}
}
