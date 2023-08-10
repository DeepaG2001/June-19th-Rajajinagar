package com.xworkz.encap.com;

public class RapidoRunner {

	public static void main(String[] args) {
		System.out.println("invocking main rapidoRunner");

		Rapido ref = new Rapido();

		ref.setBikeNo("KA25JL6736");
		System.out.println(ref.getBikeNo());

		ref.setBooked(false);
		ref.setDropedLocation(null);
		System.out.println(ref.getDropedLocation());

		ref.setDuration(5);
		System.out.println(ref.getDuration());
		ref.setEmail("deepag@gmail.com");
		System.out.println(ref.getEmail());
		ref.setHelmet(false);
		ref.setNoOfSeats(2);
		System.out.println(ref.getNoOfSeats());

		ref.setPaymentStatus(true);
		System.out.println(ref.isPaymentStatus());

		ref.setPickupLocation("rajajinagar");
		System.out.println(ref.getPickupLocation());
		ref.setPrice(400);
		System.out.println(ref.getPrice());
		ref.setRating(5);
		System.out.println(ref.getRating());
		ref.setReiderGender("Male");
		System.out.println(ref.getReiderGender());
		ref.setRiderName("Deepa");
		System.out.println(ref.getRiderName());
		ref.setRouteMap(false);

	}
}
