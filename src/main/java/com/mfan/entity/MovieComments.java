package com.mfan.entity;

import java.util.Date;

public class MovieComments {
	private Date commentDate;
	private String emailAddress;
	private String comments;
	private String movieIdentifier;
	
	public Date getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getMovieIdentifier() {
		return movieIdentifier;
	}
	public void setMovieIdentifier(String movieIdentifier) {
		this.movieIdentifier = movieIdentifier;
	}
	
	
}
