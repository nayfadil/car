package com.master.car.dto;

import java.util.List;

import com.master.car.entities.CarDetail;

public class CarDetailResponse {

	private Long id;
	private Long carTypeId;
	private String model;
	private String manufacturer;
	private Integer year;
	private String color;
	private String type;
	private List<CarPartsResponse> parts;
	
	public CarDetailResponse(CarDetail car, String type, List<CarPartsResponse> parts){
		this.id = car.getId();
		this.carTypeId = car.getCarTypeId();
		this.model = car.getModel();
		this.manufacturer = car.getManufacturer();
		this.year = car.getYear();
		this.color = car.getColor();
		this.type = type;
		this.parts = parts;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCarTypeId() {
		return carTypeId;
	}
	public void setCarTypeId(Long carTypeId) {
		this.carTypeId = carTypeId;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<CarPartsResponse> getParts() {
		return parts;
	}
	public void setParts(List<CarPartsResponse> parts) {
		this.parts = parts;
	}
	
	
}
