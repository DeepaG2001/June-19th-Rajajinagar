package com.xworkz.casting.util2;

import com.xworkz.casting.app2.*;

public class ChocolateUtil extends Chocolate {

	public static void run(Chocolate chocolate) {

		System.out.println(chocolate.color);
		chocolate.tasty();

		if (chocolate instanceof DarkChocolate) 
		{
			System.out.println("chocolate is DarkChocolate");

			DarkChocolate darkChocolate = (DarkChocolate) chocolate;
			System.out.println(darkChocolate.quantity);
			darkChocolate.eat();
		}
		
		if (chocolate instanceof CaramelChocolate) {
			System.out.println("chocolate is caramel");

			CaramelChocolate caramelChocolate = (CaramelChocolate) chocolate;
			System.out.println(caramelChocolate.good);
			caramelChocolate.goodSmell();
		
		}
       }
	}
