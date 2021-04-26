package com.customer.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.demo.model.Item;
import com.customer.demo.repository.ItemRepository;
import com.customer.demo.service.ItemService;

@Transactional
@Service
public class ItemServiceImpl implements ItemService{

	@Autowired
	private ItemRepository itemRepository;
	@Override
	public void addItem(Item items) {
		// TODO Auto-generated method stub
		itemRepository.saveAndFlush(items);
	}

	@Override
	public List<Item> getAllItemList() {
		// TODO Auto-generated method stub
		return itemRepository.findAll();
	}

	@Override
	public Optional<Item> getItemById(int id) {
		// TODO Auto-generated method stub
		return itemRepository.findById(id);
	}

	@Override
	public void deletItemById(int id) {
		// TODO Auto-generated method stub
		itemRepository.deleteById(id);
	}

}
