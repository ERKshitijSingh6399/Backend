package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Information;

public interface InformationRepository extends JpaRepository<Information, Integer>{

}
