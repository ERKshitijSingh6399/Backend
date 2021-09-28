package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Queries;

public interface QueryRepository extends JpaRepository<Queries, Integer>{

}
