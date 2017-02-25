package com.mfan.entity;

import javax.print.attribute.DateTimeSyntax;

public class UserSession {
	private int sessionId;
	private DateTimeSyntax sessionStartDateTime;
	private DateTimeSyntax sessionEndDateTime;
	private String userEmailAddress;
	
	public int getSessionId() {
		return sessionId;
	}
	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}
	public DateTimeSyntax getSessionStartDateTime() {
		return sessionStartDateTime;
	}
	public void setSessionStartDateTime(DateTimeSyntax sessionStartDateTime) {
		this.sessionStartDateTime = sessionStartDateTime;
	}
	public DateTimeSyntax getSessionEndDateTime() {
		return sessionEndDateTime;
	}
	public void setSessionEndDateTime(DateTimeSyntax sessionEndDateTime) {
		this.sessionEndDateTime = sessionEndDateTime;
	}
	public String getUserEmailAddress() {
		return userEmailAddress;
	}
	public void setUserEmailAddress(String userEmailAddress) {
		this.userEmailAddress = userEmailAddress;
	}
	
	
}
