package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Farmer;
import com.app.model.Queries;

@Repository
public interface QueryRepository extends JpaRepository<Queries, Integer>{

	List<Queries> findByFarmerQuery(Farmer f);
}
