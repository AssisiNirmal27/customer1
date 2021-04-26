package com.customer.demo.model;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "order")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;

	private Date orderDate;

	private String orderStatus;
	
    
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Item> items;

	public Order() {
		super();
	}

	public Order(Date orderDate, String orderStatus, List<Item> items) {
		super();
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.items = items;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus + ", items="
				+ items + "]";
	}
	
	
}
