package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Admins;
import com.app.model.Farmer;
import com.app.model.Information;
import com.app.model.Products;
import com.app.service.FarmerCrudServices;
import com.app.service.InformationCrudServices;
import com.app.service.ProductCrudServices;

@RestController
@RequestMapping("/farmer")
public class Controller {

	@Autowired
	private FarmerCrudServices service;
	@Autowired
	private ProductCrudServices pservice;
	@Autowired
	private InformationCrudServices iservice;
	
	@PostMapping("/logincheck")
	public Farmer checklogincredentials(@RequestBody Admins user)
	{
		Farmer f=service.getAccountInfoByEmail(user.getId());
		if(f!=null)
		{
		if((user.getId().equals(f.getEmail())) && (user.getPassword().equals(f.getPassword())))
			return f;
		else
			{System.out.println("Wrong password");
			return null;}
		}
		else
		{
			System.out.println("Does not exist");
			return null;
		}
	}
	
	@PostMapping("/registerfarmer")
	public Farmer registerFarmer(@RequestBody Farmer farmer)
	{
		return service.addFarmer(farmer);
	}
	
	@GetMapping("/getaccountinfo/{id}")
	public Farmer getFarmer(@PathVariable int id)
	{
		return service.getAccountInfo(id);
	}
	
	@DeleteMapping("/deletefarmer/{id}")
	public void deleteFarmer(@PathVariable int id) {
		// TODO Auto-generated method stub
		service.deleteFarmer(id);
		System.out.println("Deleted Successfully");
	}
	@PutMapping("/updatefarmer")
	public Farmer updateFarmer(@RequestBody Farmer farmer) {
		// TODO Auto-generated method stub
		return service.updateFarmer(farmer);
	}
	
	@GetMapping("/getallproducts")
	public List<Products> getAllProducts() {
		// TODO Auto-generated method stub
		return pservice.getAllProducts();
	}
	
	@GetMapping("/getallinformation")
	public List<Information> getAllInformation() {
		// TODO Auto-generated method stub
		return iservice.getAllInformation();
	}
}
