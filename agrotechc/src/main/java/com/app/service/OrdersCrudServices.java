package com.app.service;

import com.app.model.Orders;

public interface OrdersCrudServices {
	Orders addOrder(Orders orders);
	//Orders updateOrder(Orders orders);
	Orders getOrdersById(int id);
	void deleteOrdersById(int id);
}
