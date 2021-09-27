package com.app.service;

import com.app.model.Information;

public interface InformationCrudServices {
	Information addInformationLinks(Information information);
	Information updateInformationLinks(Information information);
	Information getInformationById(int id);
	void deleteInformationLinks(int id);
}
