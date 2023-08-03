package com.xworkz.casting.boot;

import com.xworkz.casting.app2.*;
import com.xworkz.casting.util2.ChocolateUtil;

public class ChocolateRunner {

	public static void main(String[] args) {

		System.out.println("invocking main in ChocolateRunner");

		Chocolate chocolate = new Chocolate();

		DarkChocolate darkChocolate = new DarkChocolate();
		CaramelChocolate caramelChocolate = new CaramelChocolate();

		ChocolateUtil.run(chocolate);
		ChocolateUtil.run(darkChocolate);
		ChocolateUtil.run(caramelChocolate);
	}

}
