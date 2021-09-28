package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Farmer;

public interface FarmerRepository extends JpaRepository<Farmer, Integer>{

	Farmer findByEmail(String email);
}
