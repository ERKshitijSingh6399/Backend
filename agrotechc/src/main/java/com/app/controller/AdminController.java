package com.app.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
import com.app.model.Farmer;
import com.app.model.Information;
import com.app.model.Orders;
import com.app.model.Products;
import com.app.model.Queries;
import com.app.service.AdminCrudServices;
import com.app.service.CompaniesCrudServices;
import com.app.service.FarmerCrudServices;
import com.app.service.FarmerSearchServices;
import com.app.service.InformationCrudServices;
import com.app.service.OrdersCrudServices;
import com.app.service.ProductCrudServices;
import com.app.service.QueryCrudServices;

@CrossOrigin
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
	@Autowired
	private  OrdersCrudServices oservice;
	@Autowired
	private FarmerSearchServices fsearchservice;
	@Autowired
	private QueryCrudServices qservice;
	
	private static Logger logac = Logger.getLogger(AdminController.class);
	
	@PostMapping("/adminlogin")
	public Admins checkadminlogincredentials(@RequestBody Admins user)
	{
		Admins a=aservice.getAccountInfo(user.getId());
		if(a!=null)
		{
		if((user.getId().equals(a.getId())) && (user.getPassword().equals(a.getPassword())))
			return a;
		else
			{logac.warn("Wrong password");
			return null;}
		}
		else
		{
			logac.warn("Does not exist");
			return null;
		}
	}
	
	//**********************Product Crud Methods************************************************************
	
	@GetMapping("/getallproducts")
	public List<Products> getAllProducts() {
		// TODO Auto-generated method stub
		return pservice.getAllProducts();
	}
	@PostMapping("/addproduct")
	public Products addProduct(@RequestBody Products product)
	{
		logac.info("Adding Product= "+product.getProductId());
		return pservice.addProduct(product);
	}

	//********************Information Crud Methods***********************************************************
	
	@PostMapping("/addinformation")
	public Information addInformation(@RequestBody Information information) {
		logac.info("Adding Information= "+information.getId());
		return iservice.addInformationLinks(information);
	}
	@PutMapping("/updateinformation")
	public Information updateInformation(@RequestBody Information information) {
		logac.info("Updating Information= "+information.getId());
		return iservice.updateInformationLinks(information);
	}
	
	//********************Companies Crud Methods***********************************************************
	
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
	
	//********************Orders Status method*********************************************************
	@GetMapping("/allorderstatus")
	public List<Orders> getAllOrders() {
		return oservice.getAllOrders();
	}
	
	//********************Farmer Crud Methods***********************************************************
	
	@DeleteMapping("/deletefarmer/{id}")
	public void deleteFarmer(@PathVariable int id) {
		// TODO Auto-generated method stub
		service.deleteFarmer(id);
		logac.info("Deleted Farmer= "+id+" Successfully");
	}
	@GetMapping("/getallfarmers")
	public List<Farmer> getAllFarmers(){
		return fsearchservice.getAllFarmers();
	}
	
	@GetMapping("/getfarmersbyname/{name}")
	public List<Farmer> getFarmersByName(@PathVariable String name){
		return fsearchservice.filterByName(name);
	}
	
	@GetMapping("/getfarmersbyage/{age}")
	public List<Farmer> getFarmersByAge(@PathVariable int age){
		return fsearchservice.filterByAge(age);
	}
	@GetMapping("/getfarmersbylandsize/{landsize}")
	public List<Farmer> getFarmersByLandSize(@PathVariable String landsize){
		return fsearchservice.filterByLandSize(landsize);
	}
	@GetMapping("/getfarmersbygender/{gender}")
	public List<Farmer> getFarmersByGender(@PathVariable String gender){
		return fsearchservice.filterByGender(gender);
	}
	
	
	//********************Query Crud Methods***********************************************************
	
	@PutMapping("/giveanswer")
	public Queries giveAnswer(@RequestBody Queries query)
	{
		logac.info("Giving Answer to Query= "+query.getQueryId());
		return qservice.addQuery(query);
	}
	
	
	
}
