package com.xworkz.encap.com;

public class Cred {

	private String userName;
	private String fullName;
	private String email;
	private String phoneNumber;
	private String address;
	private String creditCardNumber;
	private String cardExpirationDate;
	private String cardHolderName;
	private String billingAddress;
	private int rewardsPoints;
	private double creditLimit;
	private boolean isPremium;
	private boolean isVerified;

	protected String getUserName() {
		return userName;
	}

	protected void setUserName(String userName) {
		this.userName = userName;
	}

	protected String getFullName() {
		return fullName;
	}

	protected void setFullName(String fullName) {
		this.fullName = fullName;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected String getPhoneNumber() {
		return phoneNumber;
	}

	protected void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	protected String getAddress() {
		return address;
	}

	protected void setAddress(String address) {
		this.address = address;
	}

	protected String getCreditCardNumber() {
		return creditCardNumber;
	}

	protected void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	protected String getCardExpirationDate() {
		return cardExpirationDate;
	}

	protected void setCardExpirationDate(String cardExpirationDate) {
		this.cardExpirationDate = cardExpirationDate;
	}

	protected String getCardHolderName() {
		return cardHolderName;
	}

	protected void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	protected String getBillingAddress() {
		return billingAddress;
	}

	protected void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	protected int getRewardsPoints() {
		return rewardsPoints;
	}

	protected void setRewardsPoints(int rewardsPoints) {
		this.rewardsPoints = rewardsPoints;
	}

	protected double getCreditLimit() {
		return creditLimit;
	}

	protected void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	protected boolean isPremium() {
		return isPremium;
	}

	protected void setPremium(boolean premium) {
		isPremium = premium;
	}

	protected boolean isVerified() {
		return isVerified;
	}

	protected void setVerified(boolean verified) {
		isVerified = verified;
	}
}
