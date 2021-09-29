package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Integer>{

	List<Orders> findAllByFarmerId(int id);
}
