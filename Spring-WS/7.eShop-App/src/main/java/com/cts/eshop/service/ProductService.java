package com.cts.eshop.service;

import java.util.List;

import com.cts.eshop.model.Product;

public interface ProductService {

	void save(Product product);

	List<Product> findAll();

	Product findById(int id);
	List<Product> initDatabase();

}
