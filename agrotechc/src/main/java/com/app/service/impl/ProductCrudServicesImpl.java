package com.app.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Products;
import com.app.repository.ProductsRepository;
import com.app.service.ProductCrudServices;

@Service
public class ProductCrudServicesImpl implements ProductCrudServices{

	@Autowired
	private ProductsRepository repository;
	@Override
	public List<Products> getAllProducts() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	@Override
	public Products addProduct(Products product) {
		// TODO Auto-generated method stub
		return repository.save(product);
	}
	@Override
	public Products updateProduct(Products product) {
		// TODO Auto-generated method stub
		return repository.save(product);
	}
	@Override
	public Products getProductInfo(int productid) {
		// TODO Auto-generated method stub
		return repository.findById(productid).get();
	}
	@Override
	public void deleteProduct(int productid) {
		// TODO Auto-generated method stub
		repository.deleteById(productid);
	}

}
