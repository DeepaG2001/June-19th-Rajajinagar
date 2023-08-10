package com.xworkz.encap.com;

public class NammaMetro {

	private String lineName;
	private String stationName;
	private int lineNo;
	private long trainCapacity;
	private String nextStation;
	private String previousStation;
	private boolean isRunning;
	private boolean isDelay;
	private String arrivalTime;
	private double price;
	private long noOfPassenger;
	private int platformNo;
	private boolean routeMap;
	private long trainSpeed;

	protected String getLineName() {
		return lineName;
	}

	protected void setLineName(String lineName) {
		this.lineName = lineName;
	}

	protected String getStationName() {
		return stationName;
	}

	protected void setStationName(String stationName) {
		this.stationName = stationName;
	}

	protected int getLineNo() {
		return lineNo;
	}

	protected void setLineNo(int lineNo) {
		this.lineNo = lineNo;
	}

	protected long getTrainCapacity() {
		return trainCapacity;
	}

	protected void setTrainCapacity(long trainCapacity) {
		this.trainCapacity = trainCapacity;
	}

	protected String getNextStation() {
		return nextStation;
	}

	protected void setNextStation(String nextStation) {
		this.nextStation = nextStation;
	}

	protected String getPreviousStation() {
		return previousStation;
	}

	protected void setPreviousStation(String previousStation) {
		this.previousStation = previousStation;
	}

	protected boolean isRunning() {
		return isRunning;
	}

	protected void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	protected boolean isDelay() {
		return isDelay;
	}

	protected void setDelay(boolean isDelay) {
		this.isDelay = isDelay;
	}

	protected String getArrivalTime() {
		return arrivalTime;
	}

	protected void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	protected double getPrice() {
		return price;
	}

	protected void setPrice(double price) {
		this.price = price;
	}

	protected long getNoOfPassenger() {
		return noOfPassenger;
	}

	protected void setNoOfPassenger(long noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
	}

	protected int getPlatformNo() {
		return platformNo;
	}

	protected void setPlatformNo(int platformNo) {
		this.platformNo = platformNo;
	}

	protected boolean isRouteMap() {
		return routeMap;
	}

	protected void setRouteMap(boolean routeMap) {
		this.routeMap = routeMap;
	}

	protected long getTrainSpeed() {
		return trainSpeed;
	}

	protected void setTrainSpeed(long trainSpeed) {
		this.trainSpeed = trainSpeed;
	}

}
