package com.app.service;

import com.app.model.Cart;

public interface CartCrudServices {
	Cart addCartItem(Cart cart);
	Cart getCartInfo(int cartid);
	void deleteCartItem(int cartid);
}
