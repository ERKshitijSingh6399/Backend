package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Farmer;
import com.app.repository.FarmerRepository;
import com.app.service.FarmerCrudServices;

@Service
public class FarmerCrudServicesImpl implements FarmerCrudServices{

	@Autowired
	private FarmerRepository repository;
	
	@Override
	public Farmer addFarmer(Farmer farmer) {
		// TODO Auto-generated method stub
		return repository.save(farmer);
	}

	@Override
	public Farmer updateFarmer(Farmer farmer) {
		// TODO Auto-generated method stub
		return repository.save(farmer);
	}

	@Override
	public Farmer getAccountInfo(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public void deleteFarmer(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Farmer getAccountInfoByEmail(String email) {
		// TODO Auto-generated method stub
		return repository.findByEmail(email);
	}

}
