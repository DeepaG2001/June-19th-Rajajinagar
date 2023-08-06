package com.xworkz.chaining.boot;

import com.xworkz.chaining.app4.PlayGround;

public class GroundRunner {

	public static void main(String[] args) {
		System.out.println("invocking in main MushroomRunner");

		PlayGround playGround = new PlayGround();
		System.out.println(playGround.location);
		System.out.println(playGround.gameName);
		System.out.println(playGround.noOfPeople);
		System.out.println(playGround.open);

		PlayGround playGround1 = new PlayGround("Gandhi Maidan","Harihar", 500,true);
		System.out.println(playGround1.location);
		System.out.println(playGround1.gameName);
		System.out.println(playGround1.noOfPeople);
		System.out.println(playGround1.open);

	}

}
