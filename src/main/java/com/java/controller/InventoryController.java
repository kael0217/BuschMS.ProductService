package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.dto.Inventory;
import com.java.service.InventoryService;

@Controller
@RestController
@CrossOrigin("*")
@RequestMapping("/inventory")
public class InventoryController {
	@Autowired InventoryService service;
	
	@GetMapping()
	public ResponseEntity<List<Inventory>> getAllInventories(){
		List<Inventory> inventories = service.getallInventories();
		return ResponseEntity.ok().body(inventories);
	}
}
