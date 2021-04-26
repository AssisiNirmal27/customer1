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
import com.customer.demo.model.Item;
import com.customer.demo.service.ItemService;

/**
 * @author Nirmal
 *
 */

@RestController
@RequestMapping("/restApi/")
public class ItemController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ItemController.class);

	@Autowired
	private ItemService itemService;

	/*
	 * Get All Item Information
	 * 
	 * @return
	 */

	@GetMapping("getAllItemInformation")
	public List<Item> getAllItemInformation() throws JSONException {
		LOGGER.info("Get All ItemInformation");
		List<Item> ItemList = itemService.getAllItemList();
		return ItemList;

	}

	/*
	 * Create Item Information
	 * 
	 * @return
	 */
	@PostMapping("create/item")
	public String createItemInformation(@RequestBody Item item) throws JSONException {
		LOGGER.info(" Create Item Information");
		if (item != null) {
			itemService.addItem(item);
		}
		return " Create Item SuccessFully!!!!";
	}

	/*
	 * Get Player Information By Player Id
	 * 
	 * @id
	 * 
	 * @return
	 */
	@GetMapping("itemInformation/find/{id}")
	public Item getItemInformationById(@PathVariable("id") int id) throws JSONException {
		LOGGER.info("Get Item Information ById:");
		
			Optional<Item> items = itemService.getItemById(id);
			if (items != null) {
				return items.get();
			}
		
		return null;

	}

}
