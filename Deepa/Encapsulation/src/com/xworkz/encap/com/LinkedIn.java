package com.xworkz.encap.com;

public class LinkedIn {

	private String userName;
	private String fullName;
	private String headline;
	private String email;
	private String location;
	private String profilePicture;
	private int connectionsCount;
	private int postsCount;
	private int followersCount;
	private int endorsementsCount;
	private boolean isPremium;
	private boolean isVerified;
	private String currentJob;
	private String lastActivity;

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

	protected String getHeadline() {
		return headline;
	}

	protected void setHeadline(String headline) {
		this.headline = headline;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected String getLocation() {
		return location;
	}

	protected void setLocation(String location) {
		this.location = location;
	}

	protected String getProfilePicture() {
		return profilePicture;
	}

	protected void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	protected int getConnectionsCount() {
		return connectionsCount;
	}

	protected void setConnectionsCount(int connectionsCount) {
		this.connectionsCount = connectionsCount;
	}

	protected int getPostsCount() {
		return postsCount;
	}

	protected void setPostsCount(int postsCount) {
		this.postsCount = postsCount;
	}

	protected int getFollowersCount() {
		return followersCount;
	}

	protected void setFollowersCount(int followersCount) {
		this.followersCount = followersCount;
	}

	protected int getEndorsementsCount() {
		return endorsementsCount;
	}

	protected void setEndorsementsCount(int endorsementsCount) {
		this.endorsementsCount = endorsementsCount;
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

	protected String getCurrentJob() {
		return currentJob;
	}

	protected void setCurrentJob(String currentJob) {
		this.currentJob = currentJob;
	}

	protected String getLastActivity() {
		return lastActivity;
	}

	protected void setLastActivity(String lastActivity) {
		this.lastActivity = lastActivity;
	}
	
}
