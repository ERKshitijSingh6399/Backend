package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Admins;

public interface AdminRepository extends JpaRepository<Admins, Integer>{

	Admins findByAdminId(String adminid);
}
