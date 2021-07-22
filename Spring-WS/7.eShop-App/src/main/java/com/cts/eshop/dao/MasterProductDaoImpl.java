package com.cts.eshop.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cts.eshop.model.Product;

@Repository
public class MasterProductDaoImpl implements ProductDao {
	
	void f2() {
			// update a record
	}
	void f1() {
		// save new record
	}
	
    void f3() {
    	// deleting
    }
    
    // t
    void processOperations() {
    	
    	f1(); // success   - t1
    	f2(); // success   - t2
    	f3(); // exception - t3
    }

	@Override
	public void save(Product product) {
		System.out.println(">>> MasterProductDaoImpl:: save");

	}

	@Override
	public List<Product> findAll() {
		System.out.println(">>> MasterProductDaoImpl:: findAll");

		return null;
	}

	@Override
	public Product findById(int id) {
		System.out.println(">>> MasterProductDaoImpl:: findById");

		return null;
	}

	@Override
	public List<Product> initDatabase() {
		System.out.println(">>> MasterProductDaoImpl:: initDatabase");

		return null;
	}

}
