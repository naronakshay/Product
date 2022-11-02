package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.productRepo;
import com.example.model.Product;
@Service
public class Productservice {
	
	@Autowired
	productRepo repo;
	public List<Product> saveProducts(List<Product> product) {
		
		return repo.saveAll(product);
	}

	public List<Product> getProduct() {
		
		return repo.findAll();
	}

}
