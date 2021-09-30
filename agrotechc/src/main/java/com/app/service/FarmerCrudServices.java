package com.app.service;
import java.util.List;

import com.app.model.Farmer;


public interface FarmerCrudServices {

	Farmer addFarmer(Farmer farmer);
	Farmer updateFarmer(Farmer farmer);
	Farmer getAccountInfo(int id);
	Farmer getAccountInfoByEmail(String email);
	void deleteFarmer(int id);
}
