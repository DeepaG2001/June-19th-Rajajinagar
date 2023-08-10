package com.xworkz.encap.com;

public class OlaRunner {

	public static void main(String[] args) {
		System.out.println("invocking main OlaRunner");

		Ola ref = new Ola();

		ref.setBikeNo("Ka54IG8273");
		System.out.println(ref.getBikeNo());

		ref.setBooked(false);
		System.out.println(ref.isBooked());

		ref.setDropedLocation("Haveri");
		System.out.println(ref.getDropedLocation());

		ref.setDuration(9);
		System.out.println(ref.getDuration());

		ref.setEmail("ganesh@gmail.com");
		System.out.println(ref.getEmail());
		ref.setHelmet(false);
		System.out.println(ref.isHelmet());
		ref.setNoOfSeats(6);
		System.out.println(ref.getNoOfSeats());
		ref.setPaymentStatus(false);
		System.out.println(ref.isPaymentStatus());
		ref.setPickupLocation("Hangal");
		System.out.println(ref.getPickupLocation());
		ref.setPrice(500);
		System.out.println(ref.getPrice());
		ref.setRating(6);
		System.out.println(ref.getRating());
		ref.setRouteMap(true);
		System.out.println(ref.isRouteMap());

	}

}
