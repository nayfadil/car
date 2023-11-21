package com.master.car.dto;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;

public class ErrorResponse {

	private Exception ex;
	private HttpStatus status;
	private String message;
	
	public ErrorResponse(HttpStatus status, String message, HttpMessageNotReadableException ex) {
		this.ex = ex;
		this.status = status;
		this.message = message;
	}
	
	public ErrorResponse(HttpStatus status, NoSuchElementException ex) {
		this.ex = ex;
		this.status = status;
	}

	public Exception getEx() {
		return ex;
	}

	public void setEx(HttpMessageNotReadableException ex) {
		this.ex = ex;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
