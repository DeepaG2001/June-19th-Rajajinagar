package com.xworkz.chaining.app4;

public class PlayGround extends Ground {

	public PlayGround() {
		super("rajajinagar", "Cricket", 150, true);

		System.out.println("invocking no-args in Playground");
	}

	public PlayGround(String location, String gameName, long noOfPeople, boolean open) {
		super(location, gameName, noOfPeople, open);
		System.out.println("invocking String ,String ,long ,boolean ");
	}
}
