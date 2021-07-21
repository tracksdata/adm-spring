package com.cts.eshop.dao;

import java.util.List;

import com.cts.eshop.model.Product;

public interface ProductDao {

	void save(Product product);

	List<Product> findAll();

	Product findById(int id);
	
	List<Product> initDatabase();

}