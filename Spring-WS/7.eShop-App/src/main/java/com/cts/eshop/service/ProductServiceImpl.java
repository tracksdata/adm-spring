package com.cts.eshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cts.eshop.dao.ProductDao;
import com.cts.eshop.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	@Qualifier(value = "productDaoImpl")
	private ProductDao prodDao;

	@Override
	public List<Product> initDatabase() {
		// TODO Auto-generated method stub
		return prodDao.initDatabase();
	}

	@Override
	public void save(Product product) {
		prodDao.save(product);

	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return prodDao.findAll();
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return prodDao.findById(id);
	}

}
