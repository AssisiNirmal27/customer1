package com.customer.demo.service;

import java.util.List;
import java.util.Optional;
import com.customer.demo.model.Order;

/**
 * @author Nirmal
 *
 */

public interface OrderService {
	
	
    public void addOrder(Order orders);
	
	public List<Order> getAllOrderList();
			
	public Optional<Order> getOrderById(int id);
	
	public void deletOrderById(int id);

}
