package com.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.InventoryRepository;
import com.java.dao.ProductRepository;
import com.java.dto.Inventory;
import com.java.dto.Product;
import com.java.exception.NotEnoughInventoryException;

@Service
public class InventoryServiceImpl implements InventoryService  {
	@Autowired ProductRepository productRep;
	@Autowired InventoryRepository rep;

	//add quantity
	@Override
	public void addQuantity(String productId, int quantity) {
		
		Inventory inventory = rep.findById(productId).orElse(new Inventory());
		int original = inventory.getQuantity();
		inventory.setQuantity(original+quantity);
		rep.save(inventory);
	}

	//delete quantity
	@Override
	public void reduceQuantity(String productId, int quantity){
		Inventory inventory = rep.findById(productId).orElse(new Inventory());
		int original = inventory.getQuantity();
		if(original<quantity) {
			throw new NotEnoughInventoryException("do not have enough product available!");
		}else {
			inventory.setQuantity(original-quantity);
			rep.save(inventory);
		}
	}
	
	//get single product's inventory
	public Inventory getInventory(String productId) {
		return rep.findById(productId).orElse(new Inventory());
	}

	//get all inventories
	@Override
	public List<Inventory> getallInventories() {
		return rep.findAll();
	}

}
