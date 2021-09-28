package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Crops;

public interface CropsRepository extends JpaRepository<Crops, Integer>{

}
