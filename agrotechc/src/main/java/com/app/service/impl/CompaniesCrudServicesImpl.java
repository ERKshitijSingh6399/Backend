package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Companies;
import com.app.repository.CompaniesRepository;
import com.app.service.CompaniesCrudServices;

@Service
public class CompaniesCrudServicesImpl implements CompaniesCrudServices{

	@Autowired
	private CompaniesRepository repository;

	@Override
	public Companies addCompanyDemandItem(Companies companies) {
		// TODO Auto-generated method stub
		return repository.save(companies);
	}

	@Override
	public Companies updateCompanyDemandItem(Companies companies) {
		// TODO Auto-generated method stub
		return repository.save(companies);
	}

	@Override
	public Companies getAllCompanyDemandItems(int companyid) {
		// TODO Auto-generated method stub
		return repository.findById(companyid).get();
	}

	@Override
	public void deleteCompanyDemandItem(int companyid) {
		// TODO Auto-generated method stub
		repository.deleteById(companyid);
	}

}
