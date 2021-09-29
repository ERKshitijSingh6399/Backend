package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Queries;

public interface QueryRepository extends JpaRepository<Queries, Integer>{

	List<Queries> findByFarmerId(int id);
}
