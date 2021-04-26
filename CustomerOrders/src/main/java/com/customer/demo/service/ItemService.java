package com.customer.demo.service;

import java.util.List;
import java.util.Optional;

import com.customer.demo.model.Item;

/**
 * @author Nirmal
 *
 */

public interface ItemService {
	
		
    public void addItem(Item items);
	
	public List<Item> getAllItemList();
			
	public Optional<Item> getItemById(int id);
	
	public void deletItemById(int id);

}
