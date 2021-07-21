package com.cts.eshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.eshop.dao.ProductDao;

@Service
//dependent
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao; // dependency

	@Override
	public void saveProduct() {
		System.out.println(">>> Service::: saveProduct");
		prodDao.save();

	}

}
