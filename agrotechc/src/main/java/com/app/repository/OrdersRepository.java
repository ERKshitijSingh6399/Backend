package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Farmer;
import com.app.model.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer>{

	List<Orders> findByFarmerOrder(Farmer f);
}
