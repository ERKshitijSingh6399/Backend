package com.app.service;

import java.util.List;

import com.app.model.Cart;
import com.app.model.Farmer;

public interface CartCrudServices {
	Cart addCartItem(Cart cart);
	Cart getCartInfo(int cartid);
	void deleteCartItem(int cartid);
	List<Cart> getMyCart(Farmer f);
}
