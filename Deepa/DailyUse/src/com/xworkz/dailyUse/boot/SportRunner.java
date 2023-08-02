package com.xworkz.dailyUse.boot;

import com.xworkz.dailyUse.app.*;

public class SportRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in SportRunner");
		
		
		Player players1 = new Player("Dhoni", "Eleven");
		Player players2 = new Player("Uraj", "seven");
		Player players3 = new Player("Rohit", "Two");
		Player players4 = new Player("Virat", "Three");
		Player players5 = new Player("Sachin", "fourteen");

		Player[] players = { players1, players2, players3, players4, players5 };
		
		Sport sport=new Sport("Cricket", players);
		sport.printInfo();
		
	}

}