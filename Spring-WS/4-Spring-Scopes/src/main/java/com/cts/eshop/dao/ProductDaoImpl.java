package com.cts.eshop.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository(value = "prodRepo")
@Scope("prototype")
public class ProductDaoImpl {

	public ProductDaoImpl() {
		System.out.println(">>> ProductDaoImpl:: object created at " + System.identityHashCode(this));
	}

	public void save() {

		/*
		String s1 = "Abc";
		String s2 = new String("Abc");
		// == always compares hash codes
		// equals always compares content
		System.out.println("S1 Hashcode: " + s1.hashCode());
		System.out.println("S2 Hascode: " + s2.hashCode());
		System.out.println("----------------------------------");
		System.out.println("S1 Hashcode: " + System.identityHashCode(s1));
		System.out.println("S2 Hascode: " + System.identityHashCode(s2));
		

		if (s1.equals(s2)) {
			System.out.println("Equals");
		} else {
			System.out.println("Not Equals");
		}
		*/

		 System.out.println(">>> DAO::: Saving Product... using "+System.identityHashCode(this));
	}

}
