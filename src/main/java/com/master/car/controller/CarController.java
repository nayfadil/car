package com.master.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.master.car.service.CarService;

@RestController
@RequestMapping("/api/car")
public class CarController {

	@Autowired
	private CarService carService;
	
	@RequestMapping(path = "/carType/getAll", method = RequestMethod.GET)
	public ResponseEntity<?> getAllCarType(){
		return new ResponseEntity<>(carService.getCarType(), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/carDetail/getById", method = RequestMethod.GET)
	public ResponseEntity<?> getCarDetailById(@RequestParam Long id){
		return new ResponseEntity<>(carService.getDetailCar(id), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/carDetail/getAll", method = RequestMethod.GET)
	public ResponseEntity<?> getAllCar(){
		return new ResponseEntity<>(carService.getCar(), HttpStatus.OK);
	}
}
