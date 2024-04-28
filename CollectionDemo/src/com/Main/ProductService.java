package com.Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ProductService {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Product> products = new ArrayList<>();

		Product p1 = new Product();
		p1.setProductId(1001);
		p1.setProductName("IphoneX");
		p1.setProductPrice(65000);
		p1.setCategory("Mobile");

		Product p2 = new Product();
		p2.setProductId(1002);
		p2.setProductName("SonyXP");
		p2.setProductPrice(85000);
		p2.setCategory("TV");

		Product p3 = new Product();
		p3.setProductId(1003);
		p3.setProductName("ScanDisk");
		p3.setProductPrice(2000);
		p3.setCategory("Pendrive");

		Product p4 = new Product();
		p4.setProductId(1004);
		p4.setProductName("IphoneY");
		p4.setProductPrice(75000);
		p4.setCategory("Mobile");

		Product p5 = new Product();
		p5.setProductId(1004);
		p5.setProductName("IphoneY");
		p5.setProductPrice(75000);
		p5.setCategory("Mobile");

		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);

		ProductServices productServices = new ProductServices();

		List<String> productNames = productServices.mapToProductNames(products);

		Iterator<String> i = productNames.iterator();

		while (i.hasNext()) {
			String p = i.next();
			System.out.println(p);

		}

		System.out.println("Enter your category to search");
		String categoryName = sc.next();

		List<Product> filteredItems = productServices.filterProducts(products, categoryName);

		Iterator<Product> f = filteredItems.iterator();
		
		if(filteredItems.size()!=0)
		while (f.hasNext()) {
			Product p = f.next();
			System.out.println(
					p.getProductId() + " " + p.getProductName() + " " + p.getProductPrice() + " " + p.getCategory());

		}
		else
			System.out.println("No products found");
		sc.close();
	}

}
