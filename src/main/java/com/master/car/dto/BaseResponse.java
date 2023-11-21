package com.master.car.dto;

public class BaseResponse {

	private ResponseTemplateHeader header;
	private String message;
	public ResponseTemplateHeader getHeader() {
		return header;
	}
	public void setHeader(ResponseTemplateHeader header) {
		this.header = header;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
