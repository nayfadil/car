package com.master.car.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.master.car.dto.CarDetailResponse;
import com.master.car.dto.CarPartsResponse;
import com.master.car.dto.ResponseTemplate;
import com.master.car.entities.CarDetail;
import com.master.car.entities.CarParts;
import com.master.car.entities.CarType;
import com.master.car.repository.CarDetailRepository;
import com.master.car.repository.CarPartsRepository;
import com.master.car.repository.CarTypeRepository;
import com.master.car.service.CarService;
import com.master.car.service.ResponseService;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarTypeRepository carTypeRepository;
	
	@Autowired
	private CarDetailRepository carDetailRepository;
	
	@Autowired
	private CarPartsRepository carPartsRepository;
	
	@Autowired
	private ResponseService responseService;
	
	@Override
	public ResponseTemplate<List<CarType>> getCarType(){
		return responseService.buildApiResponse(carTypeRepository.findAll());
	}
	
	@Override
	public ResponseTemplate<CarDetailResponse> getDetailCar(Long id){
		
		CarDetail car = carDetailRepository.findById(id).get();
		Long carTypeId = car.getCarTypeId();
		List<CarParts> listPart = carPartsRepository.findByCarTypeId(carTypeId);
		List<CarPartsResponse> dataParts = new ArrayList<>();
		for(CarParts carPart : listPart) {
			CarPartsResponse parts = new CarPartsResponse();
			parts.setPartsId(carPart.getId());
			parts.setPartName(carPart.getPartName());
			
			dataParts.add(parts);
		}
		CarType carType = carTypeRepository.findById(carTypeId).get();
		
		CarDetailResponse data = new CarDetailResponse(car, carType.getType(), dataParts);
		
		return responseService.buildApiResponse(data);
	}
	
	@Override
	public ResponseTemplate<List<CarDetailResponse>> getCar(){
		List<CarDetailResponse> data = new ArrayList<>();
		List<CarDetail> carList = carDetailRepository.findAll();
		for(CarDetail car : carList) {
			Long carTypeId = car.getCarTypeId();
			List<CarParts> listPart = carPartsRepository.findByCarTypeId(carTypeId);
			List<CarPartsResponse> dataParts = new ArrayList<>();
			for(CarParts carPart : listPart) {
				CarPartsResponse parts = new CarPartsResponse();
				parts.setPartsId(carPart.getId());
				parts.setPartName(carPart.getPartName());
				
				dataParts.add(parts);
			}
			CarType carType = carTypeRepository.findById(carTypeId).get();
			
			CarDetailResponse detailResponse = new CarDetailResponse(car, carType.getType(), dataParts);
			
			data.add(detailResponse);
		}
		
		return responseService.buildApiResponse(data);
	}
}
