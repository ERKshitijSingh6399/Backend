package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Integer>{

}
