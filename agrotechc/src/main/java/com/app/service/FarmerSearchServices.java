package com.app.service;
import java.util.List;

import com.app.model.Farmer;

public interface FarmerSearchServices {

	List<Farmer> filterByName(String name);
	List<Farmer> filterByAge(int age);
	List<Farmer> filterByLandSize(String landsize);
	List<Farmer> filterByGender(String gender);
	List<Farmer> getAllFarmers();
}
