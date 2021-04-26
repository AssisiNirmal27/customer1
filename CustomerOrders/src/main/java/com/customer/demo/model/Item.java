package com.customer.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int itemId;
	private String itemName;
	private double itemUnitPrice;
	private long itemQuantity;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "order_id ")
	private Order order;

	public Item() {
		super();
	}

	public Item(String itemName, double itemUnitPrice, long itemQuantity, Order order) {
		super();
		this.itemName = itemName;
		this.itemUnitPrice = itemUnitPrice;
		this.itemQuantity = itemQuantity;
		this.order = order;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemUnitPrice() {
		return itemUnitPrice;
	}

	public void setItemUnitPrice(double itemUnitPrice) {
		this.itemUnitPrice = itemUnitPrice;
	}

	public long getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(long itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemUnitPrice=" + itemUnitPrice
				+ ", itemQuantity=" + itemQuantity + ", order=" + order + "]";
	}

	
}
