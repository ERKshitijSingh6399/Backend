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
import com.app.model.Companies;
import com.app.model.Information;
import com.app.model.Products;
import com.app.service.AdminCrudServices;
import com.app.service.CompaniesCrudServices;
import com.app.service.FarmerCrudServices;
import com.app.service.InformationCrudServices;
import com.app.service.ProductCrudServices;

@RestController
@RequestMapping("/admins")
public class AdminController {

	
	@Autowired
	private ProductCrudServices pservice;
	@Autowired
	private FarmerCrudServices service;
	@Autowired
	private InformationCrudServices iservice;
	@Autowired
	private CompaniesCrudServices cmpservice;
	@Autowired
	private AdminCrudServices aservice;
	
	@PostMapping("/adminlogin")
	public Admins checkadminlogincredentials(@RequestBody Admins user)
	{
		Admins a=aservice.getAccountInfo(user.getId());
		if(a!=null)
		{
		if((user.getId()==a.getId()) && (user.getPassword().equals(a.getPassword())))
			return a;
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
	
	@DeleteMapping("/deletefarmer/{id}")
	public void deleteFarmer(@PathVariable int id) {
		// TODO Auto-generated method stub
		service.deleteFarmer(id);
		System.out.println("Deleted Successfully");
	}
	@GetMapping("/getallproducts")
	public List<Products> getAllProducts() {
		// TODO Auto-generated method stub
		return pservice.getAllProducts();
	}
	@PostMapping("/addproduct")
	public Products addProduct(@RequestBody Products product)
	{
		return pservice.addProduct(product);
	}
	
	@PostMapping("/addinformation")
	public Information addInformation(@RequestBody Information information) {
		// TODO Auto-generated method stub
		return iservice.addInformationLinks(information);
	}
	@PutMapping("/updateinformation")
	public Information updateInformation(@RequestBody Information information) {
		// TODO Auto-generated method stub
		return iservice.updateInformationLinks(information);
	}
	@PostMapping("/addcompanydemand")
	public Companies addCompany(@RequestBody Companies companies)
	{
		return cmpservice.addCompanyDemandItem(companies);
	}
	@DeleteMapping("/deletecompanydemand/{id}")
	public void deleteCompany(@PathVariable int companyid) {
		// TODO Auto-generated method stub
		cmpservice.deleteCompanyDemandItem(companyid);;
	}
}
