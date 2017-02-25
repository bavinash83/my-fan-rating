package com.mfan.entity;

public class UserMovieRatings {
	private String userEmailAddress;
	private String movieIdentifier;
	private int storyRating;
	private int performanceRating;
	private int productionValuesRating;
	private int userSatisfactionRating;
	
	public String getUserEmailAddress() {
		return userEmailAddress;
	}
	public void setUserEmailAddress(String userEmailAddress) {
		this.userEmailAddress = userEmailAddress;
	}
	public String getMovieIdentifier() {
		return movieIdentifier;
	}
	public void setMovieIdentifier(String movieIdentifier) {
		this.movieIdentifier = movieIdentifier;
	}
	public int getStoryRating() {
		return storyRating;
	}
	public void setStoryRating(int storyRating) {
		this.storyRating = storyRating;
	}
	public int getPerformanceRating() {
		return performanceRating;
	}
	public void setPerformanceRating(int performanceRating) {
		this.performanceRating = performanceRating;
	}
	public int getProductionValuesRating() {
		return productionValuesRating;
	}
	public void setProductionValuesRating(int productionValuesRating) {
		this.productionValuesRating = productionValuesRating;
	}
	public int getUserSatisfactionRating() {
		return userSatisfactionRating;
	}
	public void setUserSatisfactionRating(int userSatisfactionRating) {
		this.userSatisfactionRating = userSatisfactionRating;
	}
	
	
}
