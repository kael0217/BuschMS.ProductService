package com.java.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

import com.java.dto.Product;

@Transactional
public interface ProductRepository extends MongoRepository<Product, String>{
	
}
