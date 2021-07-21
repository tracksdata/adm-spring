package com.cts.eshop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cts.eshop.model.Product;

@Repository
public class InmemoryDB {

	private List<Product> prods = new ArrayList<>();

	public List<Product> initDb() {
		prods.add(new Product(1, "Pen", 54, "Red Ink"));
		prods.add(new Product(2, "Book", 1400, "Spring Core"));
		prods.add(new Product(3, "Mobile", 15000, "IPhone 12 Pro Max"));
		prods.add(new Product(4, "Laptop", 25000, "Mac Book Pro"));
		prods.add(new Product(5, "Charger", 950, "60 W Charger"));
		return prods;
	}

	public List<Product> getProductData() {
		return prods;
	}

}
