package com.customer.demo.controller;

import java.util.List;
import java.util.Optional;

import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.demo.model.Order;
import com.customer.demo.service.OrderService;

/**
 * @author Nirmal
 *
 */

@RestController
@RequestMapping("/restApi/")
public class OrderController {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrderController.class);

	@Autowired
	private OrderService orderService;

	/*
	 * Get All Order Information
	 * 
	 * @return
	 */

	@GetMapping("getAllOrderInformation")
	public List<Order> getAllOrderInformation() throws JSONException {
		LOGGER.info("Get All ItemInformation");
		List<Order> orderList = orderService.getAllOrderList();
		return orderList;

	}

	/*
	 * Create Order Information
	 * 
	 * @return
	 */
	@PostMapping("create/order")
	public String createItemInformation(@RequestBody Order order) throws JSONException {
		LOGGER.info(" Create Order Information");
		if (order != null) {
			orderService.addOrder(order);
		}
		return " Create Order SuccessFully!!!!";
	}

	/*
	 * Get Order Information By Player Id
	 * 
	 * @id
	 * 
	 * @return
	 */
	@GetMapping("orderInformation/find/{id}")
	public Order getOrderInformationById(@PathVariable("id") int id) throws JSONException {
		LOGGER.info("Get Order Information ById:");

		Optional<Order> orders = orderService.getOrderById(id);
		if (orders != null) {
			return orders.get();
		}

		return null;

	}

}
