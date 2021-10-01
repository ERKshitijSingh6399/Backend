package com.app.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Admins;
import com.app.repository.AdminRepository;
import com.app.service.AdminCrudServices;

@Service
@Transactional
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

	@Override
	public List<Admins> getAllAdmins() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
