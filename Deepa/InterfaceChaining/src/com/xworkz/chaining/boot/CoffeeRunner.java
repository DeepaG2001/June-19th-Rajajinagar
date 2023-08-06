package com.xworkz.chaining.boot;
import com.xworkz.chaining.app7.*;


	public class CoffeeRunner {

		public static void main(String[] args) {
			System.out.println("invocking in main CoffeeRunner");
			
			FilterCoffee filterCoffee=new FilterCoffee();
			System.out.println(filterCoffee.type);
			System.out.println(filterCoffee.shopName);
			System.out.println(filterCoffee.price);
			System.out.println(filterCoffee.noOfCup);
			
			FilterCoffee filterCoffee1=new FilterCoffee("Mangaloru cafe", "Cappuccino",200,4);
			System.out.println(filterCoffee1.type);
			System.out.println(filterCoffee1.shopName);
			System.out.println(filterCoffee1.price);
			System.out.println(filterCoffee1.noOfCup);
		}				
}
