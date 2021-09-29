package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Orders;
import com.app.repository.OrdersRepository;
import com.app.service.OrdersCrudServices;

@Service
public class OrdersCrudServicesImpl implements OrdersCrudServices{

	@Autowired
	private OrdersRepository repository;
	
	@Override
	public Orders addOrder(Orders orders) {
		// TODO Auto-generated method stub
		return repository.save(orders);
	}

//	@Override
//	public Orders updateOrder(Orders orders) {
//		// TODO Auto-generated method stub
//		return repository.save(orders);
//	}


	@Override
	public void deleteOrdersById(int ordersid) {
		// TODO Auto-generated method stub
		repository.deleteById(ordersid);
	}

	@Override
	public List<Orders> getOrdersByFarmerId(int id) {
		// TODO Auto-generated method stub
		return repository.findAllByFarmerId(id);
	}

}
