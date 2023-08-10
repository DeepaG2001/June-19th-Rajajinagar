package com.xworkz.encap.com;

public class Ola {

	private boolean helmet;
	private int noOfSeats;
	private String pickupLocation;
	private String dropedLocation;
	private String riderName;
	private boolean isBooked;
	private int rating;
	private boolean paymentStatus;
	private boolean routeMap;
	private String email;
	private String reiderGender;
	private double price;
	private long duration;
	private String bikeNo;

	protected boolean isHelmet() {
		return helmet;
	}

	protected void setHelmet(boolean helmet) {
		this.helmet = helmet;
	}

	protected int getNoOfSeats() {
		return noOfSeats;
	}

	protected void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	protected String getPickupLocation() {
		return pickupLocation;
	}

	protected void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	protected String getDropedLocation() {
		return dropedLocation;
	}

	protected void setDropedLocation(String dropedLocation) {
		this.dropedLocation = dropedLocation;
	}

	protected boolean isBooked() {
		return isBooked;
	}

	protected void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}

	protected String getRiderName() {
		return riderName;
	}

	protected void setRiderName(String riderName) {
		this.riderName = riderName;
	}

	protected int getRating() {
		return rating;
	}

	protected void setRating(int rating) {
		this.rating = rating;
	}

	protected boolean isPaymentStatus() {
		return paymentStatus;
	}

	protected void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	protected boolean isRouteMap() {
		return routeMap;
	}

	protected void setRouteMap(boolean routeMap) {
		this.routeMap = routeMap;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected String getReiderGender() {
		return reiderGender;
	}

	protected void setReiderGender(String reiderGender) {
		this.reiderGender = reiderGender;
	}

	protected double getPrice() {
		return price;
	}

	protected void setPrice(double price) {
		this.price = price;
	}

	protected long getDuration() {
		return duration;
	}

	protected void setDuration(long duration) {
		this.duration = duration;
	}

	protected String getBikeNo() {
		return bikeNo;
	}

	protected void setBikeNo(String bikeNo) {
		this.bikeNo = bikeNo;
	}

}
