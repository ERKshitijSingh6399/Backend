package com.app.service;

import com.app.model.Queries;

public interface QueryCrudServices {

	Queries addFarmer(Queries queries);
	Queries getQueriesInfo(int id);
	void deleteQueries(int id);
}
