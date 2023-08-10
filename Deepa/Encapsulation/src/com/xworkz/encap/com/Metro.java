package com.xworkz.encap.com;

public class Metro {

	public static void main(String[] args) {
		System.out.println("invocking Metro");

		NammaMetro ref=new NammaMetro();
		
		ref.setArrivalTime("11:03");
		System.out.println(ref.getArrivalTime());
		ref.setDelay(false);
		System.out.println(ref.isDelay());
		ref.setLineName("Green line");
		System.out.println(ref.getLineName());
		ref.setLineNo(2);
		System.out.println(ref.getLineNo());
		ref.setNextStation("NagarBavi");
		System.out.println(ref.getNextStation());
		ref.setNoOfPassenger(100);
		System.out.println(ref.getNoOfPassenger());
		ref.setPlatformNo(2);
		System.out.println(ref.getPlatformNo());
		ref.setPreviousStation("Rajajinagar");
		System.out.println(ref.getPreviousStation());
		ref.setPrice(5000);
		System.out.println(ref.getPrice());
		ref.setRouteMap(false);
		System.out.println(ref.isRouteMap());
		ref.setRunning(true);
		System.out.println(ref.isRunning());
		ref.setStationName("Kempegowda");
		System.out.println(ref.getStationName());
		ref.setTrainCapacity(40);
		System.out.println(	ref.getTrainCapacity());
		ref.setTrainSpeed(300);
		System.out.println(ref.getTrainSpeed());
	}

}
