package com.Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductServices {

	List<String> mapToProductNames(List<Product> products){
		

		ArrayList<String> productsName = new ArrayList<>();
		Iterator<Product> i = products.iterator();
		
		
		while (i.hasNext()) {
			Product p = i.next();
			
			productsName.add(p.getProductName());
		
		
	}
	return productsName;
	}
	
	
	
	List<Product> filterProducts(List<Product> products, String categoryName){
		
		ArrayList<Product> filtered = new ArrayList<>();
		Iterator<Product> i = products.iterator();
		
		
		while (i.hasNext()) {
			Product p = i.next();
			if (p.getCategory().equalsIgnoreCase(categoryName)) {
				filtered.add(p);
			}

		}
		
		return filtered;
	}
}
