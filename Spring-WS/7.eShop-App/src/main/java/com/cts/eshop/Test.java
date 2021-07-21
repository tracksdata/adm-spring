package com.cts.eshop;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.eshop.config.AppConfig;
import com.cts.eshop.model.Product;
import com.cts.eshop.service.ProductService;
import com.cts.eshop.service.ProductServiceImpl;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		ProductService ps = ac.getBean(ProductServiceImpl.class);
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("1.Add");
			System.out.println("2.Display");
			System.out.println("3.Find");
			System.out.println("4.Exit");
			System.out.println("Choice: ");
			int ch = sc.nextInt();
			switch (ch) {

			case 2:
				ps.findAll().forEach(product -> {
					System.out.println(product);
				});
				break;
			case 1:
				System.out.println("Provide ID,Name,Price and Description");
				int id = sc.nextInt();
				sc.nextLine();
				String name = sc.nextLine();
				double price = sc.nextDouble();
				sc.nextLine();
				String description = sc.nextLine();

				Product product = new Product(id, name, price, description);
				ps.save(product);
				System.out.println(">>>>> Product Saved <<<<");
				break;
			case 4:
				System.out.println(">>>> Good Bye. Visit Again <<<< ");
				System.exit(0);
			default:
				System.out.println("Invalid Choice. try again");

			}
		}
		

	}

}
