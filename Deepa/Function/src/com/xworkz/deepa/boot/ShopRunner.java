package com.xworkz.deepa.boot;

import com.xworkz.deepa.app.*;
public class ShopRunner {


	 public static void main(String[] args) {
		 
		 System.out.println("invoking main in ShopRunner");
		 
		 Shop shop = new Shop();
		 System.out.println("shopCategory:"+shop.shopCategory);
		 System.out.println("noOfItems:"+shop.noOfItems);
		 SalesMan salesMan = shop.man;
		 System.out.println("totalSales:"+salesMan.totalSales);
		 System.out.println("salary:"+salesMan.salary);
		 shop.calling();
		 shop.feedBack();
   }
}
