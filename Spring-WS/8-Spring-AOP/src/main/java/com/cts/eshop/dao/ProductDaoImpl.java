package com.cts.eshop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl {

	public void save() {
		System.out.println(">>> ProductDaoImpl:: save");
	}
	
	public void saveProduct() {
		System.out.println(">>> ProductDaoImpl:: saveProduct");
	}

	public void findAll() {
		System.out.println(">>> ProductDaoImpl:: findAll");
	}

	public void update() {
		System.out.println(">>> ProductDaoImpl:: update");
	}

	public void findById() {
		System.out.println(">>> ProductDaoImpl:: findById");
	}

}
