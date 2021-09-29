package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Farmer;
import com.app.model.Queries;
import com.app.repository.QueryRepository;
import com.app.service.QueryCrudServices;

@Service
public class QueriesCrudServicesImpl implements QueryCrudServices{

	@Autowired
	private QueryRepository repository;
	
	@Override
	public Queries addQuery(Queries queries) {
		// TODO Auto-generated method stub
		return repository.save(queries);
	}

	@Override
	public void deleteQueries(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<Queries> getMyQueries(Farmer f) {
		// TODO Auto-generated method stub
		return repository.findByFarmerQuery(f);
	}

	@Override
	public List<Queries> getAllQueries() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
