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

import com.app.model.Cart;
import com.app.model.Farmer;
import com.app.model.Information;
import com.app.model.Orders;
import com.app.model.Products;
import com.app.model.Queries;
import com.app.model.Companies;
import com.app.service.CartCrudServices;
import com.app.service.CompaniesCrudServices;
import com.app.service.FarmerCrudServices;
import com.app.service.InformationCrudServices;
import com.app.service.OrdersCrudServices;
import com.app.service.ProductCrudServices;
import com.app.service.QueryCrudServices;

@CrossOrigin
@RestController
@RequestMapping("/farmer")
public class Controller {

	@Autowired
	private CartCrudServices cservice;
	@Autowired
	private FarmerCrudServices service;
	@Autowired
	private ProductCrudServices pservice;
	@Autowired
	private InformationCrudServices iservice;
	@Autowired
	private OrdersCrudServices oservice;
	@Autowired
	private QueryCrudServices qservice;
	@Autowired
	private CompaniesCrudServices comservices;
	
	private static Logger logc = Logger.getLogger(Controller.class);

	
	@PostMapping("/logincheck")
	public Farmer checklogincredentials(@RequestBody Farmer user) throws Exception
	{
		Farmer f=service.getAccountInfoByEmail(user.getEmail());
		Farmer f1=new Farmer();
		if(f!=null)
		{
		if((user.getEmail().equals(f.getEmail())) && (user.getPassword().equals(f.getPassword())))
			f1=f;
		else
			{logc.warn("Wrong password");
			}
		}
		else
		{
			logc.warn("Does not exist");
		}
		return f1;
	}
	
	//*****************************************Farmer Crud Methods**********************************************
	@PostMapping("/registerfarmer")
	public Farmer registerFarmer(@RequestBody Farmer farmer)
	{
		Farmer f = service.addFarmer(farmer);
		if(f!=null)
			logc.info("Registered Successfully");
		return f;
	}
	
	@GetMapping("/getaccountinfo/{id}")
	public Farmer getFarmer(@PathVariable int id)
	{
		logc.info("Getting Account Info for Farmerid="+id);
		return service.getAccountInfo(id);
	}
	
	@DeleteMapping("/deletefarmer/{id}")
	public void deleteFarmer(@PathVariable int id) {
		// TODO Auto-generated method stub
		service.deleteFarmer(id);
		logc.info("Deleted Farmer Account with Id ="+id+" Successfully");
	}
	@PutMapping("/updatefarmer")
	public Farmer updateFarmer(@RequestBody Farmer farmer) {
		logc.info("Updating Farmer");
		return service.updateFarmer(farmer);
	}
	
	//*********************************************Products method
	@GetMapping("/getallproducts")
	public List<Products> getAllProducts() {
		logc.info("Getting list of all products");
		return pservice.getAllProducts();
	}
	
	//**********************************************Information method
	@GetMapping("/getallinformation")
	public List<Information> getAllInformation() {
		// TODO Auto-generated method stub
		return iservice.getAllInformation();
	}
	
	//***********************************************Order Method
	@GetMapping("/myorderstatus/{id}")
	public List<Orders> getAllOrders(@PathVariable int id) {
		logc.info("Showing Order to Farmer with Id="+id);
		return oservice.getOrdersByFarmerId(service.getAccountInfo(id));
	}
	
	//*********************Cart Methods*********************************************************************
	@PostMapping("/addtocart")
	public Cart addToCart(@RequestBody Cart cart) {
		return cservice.addCartItem(cart);
	}
	
	@DeleteMapping("/deletefromcart/{cartid}")
	public void deleteCartItem(@PathVariable int cartid) {
		cservice.deleteCartItem(cartid);
		logc.info("Deleted Cart Item with Id ="+cartid+" Successfully");
	}

	@PostMapping("/viewmycart/{farmerid}")
	public List<Cart> viewMyCart(@PathVariable int farmerid){
		logc.info("Showing Cart to FarmerId="+farmerid);
		return cservice.getMyCart(service.getAccountInfo(farmerid));
	}
	
	@PostMapping("/carttoorders/{cartid}")
	public Orders cartToOrders(@PathVariable int cartid) {
		Cart c=cservice.getCartInfo(cartid);
		Orders o=new Orders();
		o.setOrdersStatus("OnItsWay");
		Farmer f1=new Farmer();
		Products p1=new Products();
		Farmer f2=c.getFarmerCart();
		Products p2=c.getProductCart();
		f1.setFarmerId(f2.getFarmerId());
		p1.setProductId(p2.getProductId());
		o.setFarmerOrder(f1);
		o.setProductOrder(p1);
		cservice.deleteCartItem(cartid);
		logc.info("Placing Order on CartItem="+cartid);
		logc.info("Deleting CartItem= "+cartid);
		return oservice.addOrder(o);
	}

	//**************Query Services here********************************************************************
	@PostMapping("/askquery")
	public Queries askQuery(@RequestBody Queries query)
	{
		logc.info("Query asked by ="+(query.getFarmerQuery()).getFarmerId());
		return qservice.addQuery(query);
	}
	
	@GetMapping("/getallqueries")
	public List<Queries> getAllQueries() {
		logc.info("Showing Global Queries");
		return qservice.getAllQueries();
	}
	
	@GetMapping("/getmyqueries")
	public List<Queries> getMyQueries(int id) {
		logc.info("Getting Queries asked by = "+ id);
		return qservice.getMyQueries(service.getAccountInfo(id));
	}
	@DeleteMapping("/deletemyquery/{queryId}")
	public void deleteMyQuery(@PathVariable int queryId) {
		logc.info("Deleting query with id="+queryId);
		qservice.deleteQueries(queryId);
	}
	
	//****************************************************Companies
	@GetMapping("/getallcompanies")
	public List<Companies> getAllCompanies(){
		return comservices.getAllCompanyDemandItems();
	}
}
