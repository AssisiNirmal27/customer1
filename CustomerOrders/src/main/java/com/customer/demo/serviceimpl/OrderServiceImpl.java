package com.customer.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.customer.demo.model.Order;
import com.customer.demo.repository.OrderRepository;
import com.customer.demo.service.OrderService;


@Service
@Transactional
public class OrderServiceImpl implements  OrderService{


    @Autowired
    private OrderRepository orderRepository;
	
    @Override
	public void addOrder(Order orders) {
		// TODO Auto-generated method stub
    	orderRepository.saveAndFlush(orders);
	}
    
	@Override
	public List<Order> getAllOrderList() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	@Override
	public Optional<Order> getOrderById(int id) {
		// TODO Auto-generated method stub
		return orderRepository.findById(id);
	}

	@Override
	public void deletOrderById(int id) {
		// TODO Auto-generated method stub
		orderRepository.deleteById(id);
	}

	

}
