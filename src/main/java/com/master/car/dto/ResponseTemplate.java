package com.master.car.dto;

public class ResponseTemplate<C> extends BaseResponse {

	private C data;

	public C getData() {
		return data;
	}

	public void setData(C data) {
		this.data = data;
	}
}
