package com.app.service;

import java.util.List;

import com.app.model.Information;

public interface InformationCrudServices {
	Information addInformationLinks(Information information);
	Information updateInformationLinks(Information information);
	List<Information> getAllInformation();
	void deleteInformationLinks(int id);
}
