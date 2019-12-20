package com.java.service;

import java.util.List;

import javax.swing.RepaintManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.ProductRepository;
import com.java.dto.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired ProductRepository rep;

	@Override
	public List<Product> getallProducts() {
		return rep.findAll();
	}

}
