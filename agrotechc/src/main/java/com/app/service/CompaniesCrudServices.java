package com.app.service;

import com.app.model.Companies;

public interface CompaniesCrudServices {

	Companies addCompanyDemandItem(Companies companies);
	Companies updateCompanyDemandItem(Companies companies);
	Companies getAllCompanyDemandItems(int id);
	void deleteCompanyDemandItem(int id);
}
