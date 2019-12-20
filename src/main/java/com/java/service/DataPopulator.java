package com.java.service;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.java.dao.InventoryRepository;
import com.java.dao.ProductRepository;
import com.java.dto.Inventory;
import com.java.dto.Product;


@Profile("!prod")
@Service
public class DataPopulator implements CommandLineRunner {
	
	@Autowired ProductRepository rep;
	@Autowired InventoryRepository invrep;
	
	@Override
	public void run(String... args) throws Exception {
			
		ArrayList<String> list1= new ArrayList<>();
		list1.add("laptop");
		list1.add("electronic");
		Product p1 = Product.builder().id("1").name("thinkpad").model("X1").brand("lenovo").categories(list1).price(2210f).build();
		Product p2 = Product.builder().id("2").name("Macbook").model("16.3 inch").price(2400f).categories(list1).build();
		Product p3 = Product.builder().id("3").name("AllienWare").model("A1").brand("Dell").categories(list1).price(3000f).build();
		
		Inventory i1 = Inventory.builder().productId("1").quantity(10).build();
		Inventory i2 = Inventory.builder().productId("2").quantity(20).build();
		Inventory i3 = Inventory.builder().productId("3").quantity(30).build();		
		rep.save(p3);
		rep.save(p1);
		rep.save(p2);
		invrep.save(i1);
		invrep.save(i2);
		invrep.save(i3);
	}
	
}