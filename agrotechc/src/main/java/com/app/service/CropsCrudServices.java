package com.app.service;

import com.app.model.Crops;

public interface CropsCrudServices {

	Crops addCrops(Crops crops);
	Crops updateCrops(Crops crops);
	Crops getAllCropsInfo(int id);
	void deleteCrops(int id);
}
