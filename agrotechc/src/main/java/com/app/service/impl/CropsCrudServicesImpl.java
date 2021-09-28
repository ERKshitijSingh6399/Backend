package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Crops;
import com.app.repository.CropsRepository;
import com.app.service.CropsCrudServices;

@Service
public class CropsCrudServicesImpl implements CropsCrudServices{
	
	@Autowired
	private CropsRepository repository;

	@Override
	public Crops addCrops(Crops crops) {
		// TODO Auto-generated method stub
		return repository.save(crops);
	}

	@Override
	public Crops updateCrops(Crops crops) {
		// TODO Auto-generated method stub
		return repository.save(crops);
	}

	@Override
	public Crops getAllCropsInfo(int cropsid) {
		// TODO Auto-generated method stub
		return repository.findById(cropsid).get();
	}

	@Override
	public void deleteCrops(int cropsid) {
		// TODO Auto-generated method stub
		repository.deleteById(cropsid);
	}

}
