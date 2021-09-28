package com.app.service;

import java.util.List;

import com.app.model.Products;

public interface ProductCrudServices {

	List<Products> getAllProducts();

	Products addProduct(Products product);
	Products updateProduct(Products product);
	Products getProductInfo(int productid);
	void deleteProduct(int productid);
}
