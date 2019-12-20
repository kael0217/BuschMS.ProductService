package com.java.service;

import java.util.List;

import com.java.dto.Inventory;

public interface InventoryService {
	public void addQuantity(String productId, int quantity);
	public void reduceQuantity(String productId,int quantity);
	public Inventory getInventory(String productId);
	public List<Inventory> getallInventories();
}
