package com.Main;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ProductTreeSetDemo {

	public static void main(String[] args) {

		Product p1 = new Product();
		p1.setProductId(2354);
		p1.setProductName("IphoneX");
		p1.setProductPrice(65000);
		p1.setCategory("Mobile");

		Product p2 = new Product();
		p2.setProductId(1234);
		p2.setProductName("SonyXP");
		p2.setProductPrice(85000);
		p2.setCategory("TV");

		Product p3 = new Product();
		p3.setProductId(65832);
		p3.setProductName("ScanDisk");
		p3.setProductPrice(2000);
		p3.setCategory("Pendrive");

		Product p4 = new Product();
		p4.setProductId(7895);
		p4.setProductName("IphoneY");
		p4.setProductPrice(75000);
		p4.setCategory("Mobile");

		Set<Product> products = new TreeSet<>(); // sorted
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);

		System.out.println("**** Product List ****");
		Iterator<Product> i = products.iterator();
		while (i.hasNext()) {
			Product p = i.next();
			System.out.println(
					p.getProductId() + " " + p.getProductName() + " " + p.getProductPrice() + " " + p.getCategory());
		}

	}

}
