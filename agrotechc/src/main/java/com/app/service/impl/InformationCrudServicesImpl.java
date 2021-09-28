package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Information;
import com.app.repository.InformationRepository;
import com.app.service.InformationCrudServices;

@Service
public class InformationCrudServicesImpl implements InformationCrudServices{

	@Autowired
	private InformationRepository repository;
	
	@Override
	public Information addInformationLinks(Information information) {
		// TODO Auto-generated method stub
		return repository.save(information);
	}

	@Override
	public Information updateInformationLinks(Information information) {
		// TODO Auto-generated method stub
		return repository.save(information);
	}

	@Override
	public List<Information> getAllInformation() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void deleteInformationLinks(int informationid) {
		// TODO Auto-generated method stub
		repository.deleteById(informationid);
	}

}
