package com.example.microservices.ratingsdataservice.model;

import java.util.Arrays;
import java.util.List;

public class UserRating {

	private String userId;
	private List<Rating> rating;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<Rating> getUserRating() {
		return rating;
	}

	public void setRating(List<Rating> userRating) {
		this.rating = userRating;
	}

	public void initData(String userId) {
		this.setUserId(userId);
		this.setRating(Arrays.asList(new Rating("100", 3), new Rating("200", 4)));
	}
}
