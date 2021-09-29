package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Admins;

@Repository
public interface AdminRepository extends JpaRepository<Admins, Integer>{

	Admins findByAdminId(String adminid);
}
