package com.cts.shop.dao;

import org.springframework.stereotype.Repository;

//dependency
@Repository
public class PriceMatrixImpl {

	public PriceMatrixImpl() {
		System.out.println(">>> PriceMatrixImpl object created...");
	}

	public double getItemCode(String itemCode) {

		// code to fetch item-price from database.

		return 100.00;

	}

}
