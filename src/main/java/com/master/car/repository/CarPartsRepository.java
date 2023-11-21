package com.master.car.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.master.car.entities.CarParts;

public interface CarPartsRepository extends JpaRepository<CarParts, Long>{

	
	public List<CarParts> findByCarTypeId(Long carTypeId);
	
}
