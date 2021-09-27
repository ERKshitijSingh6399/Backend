package com.app.service;

import com.app.model.Admin;

public interface AdminCrudServices {

	Admin addAdmin(Admin admin);
	void deleteAdmin(int id);
}
