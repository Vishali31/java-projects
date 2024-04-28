package com.Main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProductMapDemo {

	public static void main(String[] args) {
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


		Map<String,Product> products = new HashMap<>();
		products.put("p101",p1);
		products.put("p102",p2);
		products.put("p103",p3);
		
		String productCode = "103";
		Product Product = products.get(productCode);
		
		if(Product!= null) {
			System.out.println(Product.getProductId()+""+Product.getProductName()+""+Product.getProductPrice()+""+Product.getCategory());
		}
		else {
			
			System.out.println("product is not existing with productcode: " +productCode);
		}
		
		
		

	}

}
