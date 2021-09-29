package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer>{

	List<Cart> findAllByFarmerId(int farmerid);
}
