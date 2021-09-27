package com.app.service;

import com.app.model.Cart;

public interface CartCrudServices {
	Cart addCartItem(Cart cart);
	Cart getCartInfo(int id);
	void deleteCartItem(int id);
}
