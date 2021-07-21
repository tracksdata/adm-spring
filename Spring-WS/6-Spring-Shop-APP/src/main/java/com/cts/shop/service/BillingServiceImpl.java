package com.cts.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.shop.dao.PriceMatrixImpl;

//dependent
@Service
public class BillingServiceImpl {
	
	//@Autowired -> setter based 
	private PriceMatrixImpl price; // dependency class 
	
	// constructor based Autowiring
	
	@Autowired // constructor based
	public BillingServiceImpl(PriceMatrixImpl price) {
		this.price = price;
	}
	
	

	
	public double getCartTotal(String[] cart) {

		//PriceMatrixImpl price = new PriceMatrixImpl(); // dependency 
		
		double total = 0.0;
		for (String itemCode : cart) {
			total = total + price.getItemCode(itemCode);
		}
		return total;

	}



}
