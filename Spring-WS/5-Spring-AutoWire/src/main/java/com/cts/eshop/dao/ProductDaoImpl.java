package com.cts.eshop.dao;

import org.springframework.stereotype.Repository;

@Repository
//Dependency
public class ProductDaoImpl implements ProductDao {

	@Override
	public void save() {
		System.out.println(">>>> DAO::: Saving Product...");
	}

}
