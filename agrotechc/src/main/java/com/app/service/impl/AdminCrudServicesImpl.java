package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Admins;
import com.app.repository.AdminRepository;
import com.app.service.AdminCrudServices;

@Service
public class AdminCrudServicesImpl implements AdminCrudServices{

	@Autowired
	private AdminRepository repository;
	
	@Override
	public Admins addAdmin(Admins admins) {
		// TODO Auto-generated method stub
		return repository.save(admins);
	}

	@Override
	public void deleteAdmin(int adminsid) {
		// TODO Auto-generated method stub
		repository.deleteById(adminsid);
	}

	@Override
	public Admins getAccountInfo(String adminid) {
		// TODO Auto-generated method stub
		return repository.findByAdminId(adminid);
	}

}
