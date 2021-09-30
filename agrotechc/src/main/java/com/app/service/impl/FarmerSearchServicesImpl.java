package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Farmer;
import com.app.repository.FarmerRepository;
import com.app.service.FarmerSearchServices;

@Service
public class FarmerSearchServicesImpl implements FarmerSearchServices{

	@Autowired
	private FarmerRepository repository;
	
	@Override
	public List<Farmer> filterByName(String name) {
		// TODO Auto-generated method stub
		return repository.findByFarmerName(name);
	}
	
	@Override
	public List<Farmer> getAllFarmers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Farmer> filterByAge(int age) {
		// TODO Auto-generated method stub
		return repository.findByAge(age);
	}

	@Override
	public List<Farmer> filterByLandSize(String landsize) {
		// TODO Auto-generated method stub
		return repository.findByLandSize(landsize);
	}

	@Override
	public List<Farmer> filterByGender(String gender) {
		// TODO Auto-generated method stub
		return repository.findByGender(gender);
	}

}
