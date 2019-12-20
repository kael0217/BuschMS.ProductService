package com.java.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

import com.java.dto.Inventory;
import com.java.dto.ProductKey;

@Transactional
public interface InventoryRepository extends MongoRepository<Inventory, String> {
}
