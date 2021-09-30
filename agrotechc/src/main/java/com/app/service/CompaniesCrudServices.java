package com.app.service;

import java.util.List;

import com.app.model.Companies;

public interface CompaniesCrudServices {

	Companies addCompanyDemandItem(Companies companies);
	Companies updateCompanyDemandItem(Companies companies);
	List<Companies> getAllCompanyDemandItems();
	void deleteCompanyDemandItem(int id);
}
