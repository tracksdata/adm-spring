package com.cts.shop.service;

import com.cts.shop.dao.PriceMatrixImpl;

//dependent
public class BillingServiceImpl {
	
	/*
	 * Types of Java Objects: 2 types
	 * ----------------------------------
	 * 1. Dependency object : never depends on any other class object's. works independently. 
	 * 2. Dependent object  : always depends on dependency objects. 
	 */
	
	
	/*
	 *  -------------------
	 *  Design issues 
	 *  -------------------
	 *  
	 *  -> too many dependency class objects.
	 *  		=> per of application goes down
	 *  		=> issues with memory management
	 *  
	 *  Why this issue happened?
	 *  --------------------------
	 *  -> dependent class itself creating dependent class object.
	 *  
	 *  What is the solution?
	 *  -----------------------
	 *  -> do not create dependency class objects in the dependent classes directly.
	 *  -> instead, use look up techniques like JNDI .. etc 
	 *  -> JNDI locations are tightly coupled with dependent classes
	 *  
	 *  
	 *  What is the best solution?
	 *  ----------------------------
	 *  
	 *  -> do not create / find / look up objects, instead as some one (container) to inject/pass dependency objects: (IoC : Inversion of control) 
	 * 
	 * How to implement IoC?
	 * -------------------------
	 * -> by using dependency injection techniques
	 * 
	 * What is Dependency Injection (DI) ?
	 * ---------------------------------------
	 * -> Injecting/passing dependency object to the dependent object. 
	 * 
	 * How many ways DI can be implemented?  : 2 ways
	 * -------------------------------------------------
	 * 1. setter based DI
	 * 2. constructor based DI
	 * 
	 * 1. setter based DI
	 * ---------------------
	 * Rules
	 * --------
	 * -> Define reference of dependency class in the dependent class at class level
	 * -> create setter method for above defined reference
	 * 
	 */
	
	private PriceMatrixImpl price; // dependency class 
	
	public void setPrice(PriceMatrixImpl price) {
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
