package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Companies;

public interface CompaniesRepository extends JpaRepository<Companies, Integer>{

}
