package com.bank.exception;

import java.time.LocalDateTime;

public class MyErrorDetails {

	private LocalDateTime titmestamp;
	private String message;
	private String details;
	
	public MyErrorDetails() {
		// TODO Auto-generated constructor stub
	}

	public MyErrorDetails(LocalDateTime titmestamp, String message, String details) {
		super();
		this.titmestamp = titmestamp;
		this.message = message;
		this.details = details;
	}

	public LocalDateTime getTitmestamp() {
		return titmestamp;
	}

	public void setTitmestamp(LocalDateTime titmestamp) {
		this.titmestamp = titmestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
}
