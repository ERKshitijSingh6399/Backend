package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Farmer;

public interface FarmerRepository extends JpaRepository<Farmer, Integer>{

	Farmer findByEmail(String email);
	List<Farmer> findByFarmerName(String name);
	List<Farmer> findByAge(int age);
	List<Farmer> findByLandSize(String landsize);
	List<Farmer> findByGender(String gender);
}
