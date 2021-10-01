package com.app.service;

import java.util.List;

import com.app.model.Admins;

public interface AdminCrudServices {

	Admins addAdmin(Admins admins);
	void deleteAdmin(int adminsid);
	Admins getAccountInfo(String adminid);
	List<Admins> getAllAdmins();
	
}
