package com.cts.eshop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.eshop.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private InmemoryDB db;

	@Override
	public List<Product> initDatabase() {
		return db.initDb();
	}

	@Override
	public void save(Product product) {
		db.getProductData().add(product);
	}

	@Override
	public List<Product> findAll() {
		return db.getProductData();
	}

	@Override
	public Product findById(int id) {
		for (Product prod : db.getProductData()) {
			if (prod.getId() == id) {
				return prod;
			}
		}
		return null;
	}
}
