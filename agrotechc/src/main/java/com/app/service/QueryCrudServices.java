package com.app.service;

import java.util.List;

import com.app.model.Queries;

public interface QueryCrudServices {

	Queries addQuery(Queries queries);
	List<Queries> getMyQueries(int id);
	List<Queries> getAllQueries();
	void deleteQueries(int id);
}
