package com.master.car.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.master.car.entities.CarType;

public interface CarTypeRepository extends JpaRepository<CarType, Long> {

}
