package com.cts.shop;

import com.cts.shop.dao.PriceMatrixImpl;
import com.cts.shop.service.BillingServiceImpl;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "Item1", "Item2", "Item3" };
		String[] cart2 = { "Item1", "Item2" };
		
		
		//-----------------------------------------------
		PriceMatrixImpl price=new PriceMatrixImpl(); // dependency class
		//-----------------------------------------------

		BillingServiceImpl biller = new BillingServiceImpl(); // dependent class

		//-----------------------------------------------------
		biller.setPrice(price); //Injecting/passing dependency object (price) to the dependent object (biller) is called dependency injection
		//-----------------------------------------------------
		
		double total = biller.getCartTotal(cart1);

		System.out.println("Cart1 Total: " + total);

		total = biller.getCartTotal(cart2);

		System.out.println("Cart2 Total: " + total);

	}

}
