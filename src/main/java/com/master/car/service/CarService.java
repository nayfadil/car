package com.master.car.service;

import java.util.List;

import com.master.car.dto.CarDetailResponse;
import com.master.car.dto.ResponseTemplate;
import com.master.car.entities.CarType;

public interface CarService {
	
	ResponseTemplate<List<CarType>> getCarType();
	
	ResponseTemplate<CarDetailResponse> getDetailCar(Long id);
	
	ResponseTemplate<List<CarDetailResponse>> getCar();
}
