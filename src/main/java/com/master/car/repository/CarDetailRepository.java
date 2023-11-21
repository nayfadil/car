package com.master.car.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.master.car.entities.CarDetail;

public interface CarDetailRepository extends JpaRepository<CarDetail, Long> {

}
