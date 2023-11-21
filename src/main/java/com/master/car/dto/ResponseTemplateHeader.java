package com.master.car.dto;

import org.springframework.http.HttpStatusCode;

public class ResponseTemplateHeader {

	private HttpStatusCode statusCode;
	private String responseType;
	public HttpStatusCode getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(HttpStatusCode statusCode) {
		this.statusCode = statusCode;
	}
	public String getResponseType() {
		return responseType;
	}
	public void setResponseType(String responseType) {
		this.responseType = responseType;
	}
	
}
