package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.dao.ProductRepository;
import com.java.dto.Product;
import com.java.service.ProductService;

@Controller
@RestController
@CrossOrigin("*")
@RequestMapping("/products")
public class ProductController {
	@Autowired ProductService service;
	
	@GetMapping()
	public ResponseEntity<List<Product>> getAllProducts(){
		List<Product> products = service.getallProducts();
		return ResponseEntity.ok().body(products);
	}
}
