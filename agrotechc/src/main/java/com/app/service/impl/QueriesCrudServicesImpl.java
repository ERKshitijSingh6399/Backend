package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Queries;
import com.app.repository.QueryRepository;
import com.app.service.QueryCrudServices;

@Service
public class QueriesCrudServicesImpl implements QueryCrudServices{

	@Autowired
	private QueryRepository repository;
	
	@Override
	public Queries addFarmer(Queries queries) {
		// TODO Auto-generated method stub
		return repository.save(queries);
	}

	@Override
	public Queries getQueriesInfo(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public void deleteQueries(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

}
