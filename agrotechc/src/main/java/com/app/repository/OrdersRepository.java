package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Farmer;

public interface OrdersRepository extends JpaRepository<Farmer, Integer>{

}
