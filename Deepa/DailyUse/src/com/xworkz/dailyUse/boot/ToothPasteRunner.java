package com.xworkz.dailyUse.boot;

import com.xworkz.dailyUse.app.*;
public class ToothPasteRunner {

public static void main(String[] args) {
		
		System.out.println("invoking main in ToothpasteRunner ");
		
		String name = "colgate";
		String brand = "salt";
		
		Ingredent  item1 = new Ingredent("sugar", 2, 150);
		Ingredent  item2 = new Ingredent("jaggery", 4, 300);
		Ingredent  item3 = new Ingredent("oil", 4, 800);
		Ingredent  item4 = new Ingredent("fruits", 2, 300);
		Ingredent  item5 = new Ingredent("grocerys", 4, 500);
		
		Ingredent[] ingredents  = {item1,item2,item3,item4,item5};
		
		
		ToothPaste paste = new ToothPaste(name,brand,ingredents);
		Company company = paste.company;
		
		paste.printInfo();
		company.printInfo();
	
	}
}
